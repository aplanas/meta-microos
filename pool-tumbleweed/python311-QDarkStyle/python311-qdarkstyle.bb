SUMMARY = "A dark stylesheet for Python and Qt applications"
DESCRIPTION = "QDarkStyle is a dark stylesheet for Python and Qt applications."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python311-QDarkStyle-3.0.2-1.12.noarch.rpm"
RPM_HASH = "81492f2c490f68b397448ba6959167209f6fafc950ab0bee0bf1bc8fa9e45450f82c79d601e5d8827be55a14694bd588763878287ea4acce8a514ccb8a157e23"
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
