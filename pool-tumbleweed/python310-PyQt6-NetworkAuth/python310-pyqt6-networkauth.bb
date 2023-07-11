SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-NetworkAuth-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "230546f75990009d792e6d08519fb0ac9ad17f9982c1f18ebf962b6e564b53396e25beec39a88006615af0035b48dedde4181fe284aca1b23a0e1223fb90236a"

RPROVIDES:${PN} += "python3.10dist-pyqt6-networkauth \
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
