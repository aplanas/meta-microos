SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQt6-NetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorisation library. The bindings sit on top of PyQt6 and are implemented as \
a single module."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-NetworkAuth-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "262144995111ee3332bb140c3cacdcd0d53cd3ed4c2b0d0cbd6de545d056ab590486f115d44afba0531d4f5615d482186599518e4c8726a1d8b000ed15286137"

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
