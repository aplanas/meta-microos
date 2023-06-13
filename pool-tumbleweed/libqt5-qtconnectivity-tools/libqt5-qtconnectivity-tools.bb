SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtconnectivity-tools-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "dd23dd2fd2f8fd1dd5d3cde84664f5949e968f4a8ed49f68708b7aa916410e0e508626f2bff8c3942cda6fa139541cdd9313bf28a0447be6f7946c5056dee91a"

RPROVIDES:${PN} += "libqt5-qtconnectivity-tools \
libqt5-qtconnectivity-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
