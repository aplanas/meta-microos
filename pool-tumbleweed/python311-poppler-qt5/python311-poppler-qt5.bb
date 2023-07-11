SUMMARY = "Python binding to poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained."
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python311-poppler-qt5-21.3.0-1.13.aarch64.rpm"
RPM_HASH = "49085b8689208baac4d7a6f12c73828287ce6dd1684789bf223ab83f84e517a519ba8ace391f23f154d80bba30f6d034825fb422f3d3b39caab75efd8203d91e"

RPROVIDES:${PN} += "python3-poppler-qt5 \
python3.11dist-python-poppler-qt5 \
python311-poppler-qt5 \
python3dist-python-poppler-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
python-abi \
python311-qt5"

inherit rpm
