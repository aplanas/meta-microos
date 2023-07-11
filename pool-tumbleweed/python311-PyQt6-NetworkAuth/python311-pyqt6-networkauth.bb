SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-NetworkAuth-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "b452d8828aa8ab46389d2f9c7727de02d8c421cb926ffbe6c5496c28bb24fe4ebaf670d7c927ef9c653f0b8ecba8924f032067faa7ad8d82c23a55343d1ab2f8"

RPROVIDES:${PN} += "python3-PyQt6-NetworkAuth \
python3-qtnetworkauth-qt6 \
python3.11dist-pyqt6-networkauth \
python311-PyQt6-NetworkAuth \
python311-qtnetworkauth-qt6 \
python3dist-pyqt6-networkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-PyQt6"

inherit rpm
