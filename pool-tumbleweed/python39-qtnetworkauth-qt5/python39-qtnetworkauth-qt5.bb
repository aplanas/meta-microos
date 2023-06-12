SUMMARY = "Python bindings for the Qt Network Authorization library"
DESCRIPTION = "PyQtNetworkAuth is a set of Python bindings for The Qt Company’s Qt Network \
Authorization library. The bindings sit on top of PyQt5 and are implemented \
as a single module."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtnetworkauth-qt5-5.15.5-1.14.aarch64.rpm"
RPM_HASH = "a5cb94d72bc7363bdbe0a69e6622884064e5625ee5270162064c093910649f489e23c37f373c1018ca6a7aba77419401913dcd0e68e11793cd274da796de7205"

RPROVIDES:${PN} += "python3.9dist(pyqtnetworkauth) \
python39-PyQtNetworkAuth \
python39-qtnetworkauth-qt5 \
python39-qtnetworkauth-qt5(aarch-64) \
python3dist(pyqtnetworkauth)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5NetworkAuth.so.5()(64bit) \
libQt5NetworkAuth.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python39-qt5 \
python39-qt5-sip"

inherit rpm
