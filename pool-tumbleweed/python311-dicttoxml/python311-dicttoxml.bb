SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python311-dicttoxml-1.7.16-1.4.noarch.rpm"
RPM_HASH = "ba7f41a0f553e2ec8bdd1de40b6be00b1c5ca29ff21e45298969adcc82a7dc8e25a34dfc3d13623e9a14669f8fa51f7020d559a078bd6cfe806d19030341554b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dicttoxml \
python3.11dist-dicttoxml \
python311-dicttoxml \
python3dist-dicttoxml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
