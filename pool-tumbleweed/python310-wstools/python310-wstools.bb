SUMMARY = "WSDL parsing services package for Web Services for Python"
DESCRIPTION = "Python module for WSDL parsing services package for Web Services."
LICENSE = "ZPL-2.0"

PV = "0.4.8"

RPM_NAME = "python310-wstools-0.4.8-7.8.noarch.rpm"
RPM_HASH = "913da95918b573aa369ac83e3b4c4e774d3f1a3f9abe2ffffbfab9b4cfb3b0e1da9ca0e6b7378da07edf32474c4ace1c81601590eb32279242ceb6de24c75fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wstools \
python310-wstools \
python3dist-wstools"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
