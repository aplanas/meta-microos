SUMMARY = "Python video metadata parser"
DESCRIPTION = "Enzyme is a Python module to parse video metadata."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python311-enzyme-0.4.1-4.14.noarch.rpm"
RPM_HASH = "cfc3e0caf8cd5995f0083081be09834d72c046e97356344507dc978d7ec1ddd1709f9d49901e0ef23dd26c5934982f2b1bb1943edae46bc442f02df36f68f3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enzyme \
python3.11dist-enzyme \
python311-enzyme \
python3dist-enzyme"

RDEPENDS:${PN} += "python-abi"

inherit rpm
