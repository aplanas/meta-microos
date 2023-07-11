SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-NetworkAuth-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "aeca825d043dbc56c16473406289aa01c369ac763d959a862b50948b4e907159182b0c327dfb54eb00e4f993dd49b2ed81a6f52fec61b68fb743e69df118b6a2"

RPROVIDES:${PN} += "python3.9dist-pyqt6-networkauth \
python39-PyQt6-NetworkAuth \
python39-qtnetworkauth-qt6 \
python3dist-pyqt6-networkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-PyQt6"

inherit rpm
