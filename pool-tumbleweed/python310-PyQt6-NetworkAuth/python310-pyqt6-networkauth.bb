SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-NetworkAuth-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "03d71c64997c82512d82c1cb13f8912ea8b799315aa73d70de3ca2c11cc70df8cda23c26d3a1cf1d220fda89193918a70ba60c9dead6cccc0a2f1cb646dd8ada"

RPROVIDES:${PN} += "python3-PyQt6-NetworkAuth \
python3-qtnetworkauth-qt6 \
python3.10dist-pyqt6-networkauth \
python310-PyQt6-NetworkAuth \
python310-qtnetworkauth-qt6 \
python3dist-pyqt6-networkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-PyQt6"

inherit rpm
