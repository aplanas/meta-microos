SUMMARY = "Python interface for SEGGER J-Link"
DESCRIPTION = "Python interface for SEGGER J-Link."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python311-pylink-square-1.1.0-1.1.noarch.rpm"
RPM_HASH = "734dcf7308c7594d927360bef6586140766dc4821fc5128147c516d6ec5d005630e566c73e7e57126788ac58bf663c9e5878f9f76c8958fa66acabec4e9b7de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylink-square \
python3.11dist-pylink-square \
python311-pylink-square \
python3dist-pylink-square"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-psutil \
python311-six \
update-alternatives"

inherit rpm
