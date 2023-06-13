SUMMARY = "A GUI client for OBS"
DESCRIPTION = "A Qt-based Open Build Service (OBS) client featuring a browser, request \
management and more."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "qactus-2.1.0-2.9.aarch64.rpm"
RPM_HASH = "6c411334590134931a94adefe375b3a138086bf58b1b39ac86fa796304dcec516bab4df86ba4e9a2b4fc3c4709a2f842633448e490e8e30e41d7b74ce511b412"

RPROVIDES:${PN} += "application() \
application(qactus.desktop) \
qactus \
qactus(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqobs.so.2()(64bit) \
libqobs2(aarch-64) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
