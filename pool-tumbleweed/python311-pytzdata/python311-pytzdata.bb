SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python311-pytzdata-2020.1-3.1.noarch.rpm"
RPM_HASH = "5ecf09aa8714ad6de2f4a02ff93ccfa112a91ed9b343760364d2b95d905a90ec6bcfc1eb3f389c615e1a5b7f85f8453bebf6a18e217b7652b723e7303e0ca2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytzdata) \
python311-pytzdata \
python3dist(pytzdata)"

RDEPENDS:${PN} += "python(abi) \
timezone"

inherit rpm
