SUMMARY = "WSDL parsing services package for Web Services for Python"
DESCRIPTION = "Python module for WSDL parsing services package for Web Services."
LICENSE = "ZPL-2.0"

PV = "0.4.8"

RPM_NAME = "python311-wstools-0.4.8-7.6.noarch.rpm"
RPM_HASH = "3e53c7c19809f93ad4fb66bd3cabafaaa749cca9e6ab9a0ca8d2e0ac772ca62f9257efce8de5b5c5d8395e75130798b7f640bdd03e3dd061bdc6820672b8c278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wstools \
python311-wstools \
python3dist-wstools"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
