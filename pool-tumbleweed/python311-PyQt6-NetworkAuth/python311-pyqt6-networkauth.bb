SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-NetworkAuth-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "68f71c74601c89b433abc3c581e9d21a3cb030dbaabe5a09e8dfcb99cb00d03e6e0bb82d206b2e75698c738cfaa46fcfd3826922bf2f22d9f7cbc446602c19c3"

RPROVIDES:${PN} += "python3.11dist(pyqt6-networkauth) \
python311-PyQt6-NetworkAuth \
python311-PyQt6-NetworkAuth(aarch-64) \
python311-qtnetworkauth-qt6 \
python3dist(pyqt6-networkauth)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6NetworkAuth.so.6()(64bit) \
libQt6NetworkAuth.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-PyQt6"

inherit rpm
