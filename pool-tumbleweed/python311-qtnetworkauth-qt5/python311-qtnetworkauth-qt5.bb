SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtnetworkauth-qt5-5.15.5-1.15.aarch64.rpm"
RPM_HASH = "01a9a45fa087d146e4e35a79fab7d9d0a58ed49a7a64bba510071ffd91823c93df2b1c520ea1309687528e4430637622e587bf638696bd354f210f10f2b09f5f"

RPROVIDES:${PN} += "python3-PyQtNetworkAuth \
python3-qtnetworkauth-qt5 \
python3.11dist-pyqtnetworkauth \
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
