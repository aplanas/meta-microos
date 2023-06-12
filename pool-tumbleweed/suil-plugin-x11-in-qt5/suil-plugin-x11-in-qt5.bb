SUMMARY = "Shared object for Qt5 hosts displaying X11 LV2 GUIs"
DESCRIPTION = "Module plugin for: \
* Qt5 hosts displaying x11 LV2 GUIs using suil"
LICENSE = "ISC"

PV = "0.10.18"

RPM_NAME = "suil-plugin-x11-in-qt5-0.10.18-1.1.aarch64.rpm"
RPM_HASH = "51efef98855a91400707efdd363bd3ed54f070130b82493bdba2134b2c6f875f1759ce9b35a967c07ba578e865c308afc549e70be9ae45b7a158c50161422a05"

RPROVIDES:${PN} += "libsuil_x11_in_qt5.so()(64bit) \
suil-plugin-x11-in-qt5 \
suil-plugin-x11-in-qt5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libsuil-0-0"

inherit rpm
