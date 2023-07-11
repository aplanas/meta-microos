SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtnetworkauth-qt5-5.15.5-1.15.aarch64.rpm"
RPM_HASH = "0ddaf0aa46151496b0d6e65f73322fadc7458fefae7a35dc87f6bbeed5943d6df508fe5f4783b97413076b92a307cb675951f3fb6d4b3416c7cf8ef7ed9bf649"

RPROVIDES:${PN} += "python3.9dist-pyqtnetworkauth \
python39-PyQtNetworkAuth \
python39-qtnetworkauth-qt5 \
python3dist-pyqtnetworkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python39-qt5 \
python39-qt5-sip"

inherit rpm
