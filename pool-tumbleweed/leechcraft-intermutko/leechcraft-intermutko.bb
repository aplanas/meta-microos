SUMMARY = "LeechCraft HTTP Accept-Language header Module"
DESCRIPTION = "This module provides a HTTP Accept-Language header configurator."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-intermutko-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "56ff3fc200127f50897f1e8a4963957a38a13ec45b29aa3b74149436d355f96ad7876a05225b1408d0fa777f8749d7a2451835f9a805a55c6f156c189e71d1db"

RPROVIDES:${PN} += "leechcraft-intermutko \
leechcraft-intermutko(aarch-64) \
libleechcraft_intermutko.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
