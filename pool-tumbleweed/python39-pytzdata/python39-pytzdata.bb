SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python39-pytzdata-2020.1-3.3.noarch.rpm"
RPM_HASH = "4e389196086f9480188a387d09e3748d051747581796783f4da8ca0916bfc5f5b9ba5f69e573b13eaa57c214a23f3ff9446caf9ddc284406038eeb2b0467b606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytzdata \
python39-pytzdata \
python3dist-pytzdata"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
