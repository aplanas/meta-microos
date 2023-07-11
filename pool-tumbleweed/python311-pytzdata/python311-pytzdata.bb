SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python311-pytzdata-2020.1-3.3.noarch.rpm"
RPM_HASH = "2e2e1ed05a69efa40afea22fb234f750a563d5f81999bbaf8ddd64eca10907a928e44c716e65d7cb2123b8d69cb52ddf691c135336652e9f208676a98f988825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytzdata \
python3.11dist-pytzdata \
python311-pytzdata \
python3dist-pytzdata"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
