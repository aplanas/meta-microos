SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtnetworkauth-qt5-5.15.5-1.15.aarch64.rpm"
RPM_HASH = "0c5278d9cc2b5011b648688884c8a04855102d88e498d3b678e1178b6e899f5fd88f36da3d92e36bf6ecd3a4d3ac7730573285692b239bdc210aa1a59cc5c47f"

RPROVIDES:${PN} += "python3.10dist-pyqtnetworkauth \
python310-PyQtNetworkAuth \
python310-qtnetworkauth-qt5 \
python3dist-pyqtnetworkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python310-qt5 \
python310-qt5-sip"

inherit rpm
