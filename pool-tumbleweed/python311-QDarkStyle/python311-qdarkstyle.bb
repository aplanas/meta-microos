SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-QDarkStyle-3.0.2-2.1.noarch.rpm"
RPM_HASH = "9cb266a225c83225c4c7880ce0157b00d0b9b3192c777b492db54a683b2712a0513a0e78425fee87853f2ab945511fffb1ba018b9a02b586a85304f74e36a069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QDarkStyle \
python3.11dist-qdarkstyle \
python311-QDarkStyle \
python3dist-qdarkstyle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-QtPy \
python311-setuptools"

inherit rpm
