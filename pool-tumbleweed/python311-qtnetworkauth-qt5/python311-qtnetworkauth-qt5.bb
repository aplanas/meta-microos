SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtnetworkauth-qt5-5.15.5-1.14.aarch64.rpm"
RPM_HASH = "a670bdd98be7d1a65e15aea924481fce4804e8c6b36ee27fcd5b74ab1704711693a730e389502f4b7a510817b8873a0027deb91d259c40678137f3c4778b069c"

RPROVIDES:${PN} += "python3.11dist-pyqtnetworkauth \
python311-PyQtNetworkAuth \
python311-qtnetworkauth-qt5 \
python3dist-pyqtnetworkauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libc.so.6 \
libstdc++.so.6 \
python-abi \
python311-qt5 \
python311-qt5-sip"

inherit rpm
