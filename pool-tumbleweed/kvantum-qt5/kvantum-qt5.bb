SUMMARY = "SVG-based theme engine for Qt5 and Qt6"
DESCRIPTION = "Kvantum is an SVG-based theme engine for Qt, tuned to Plasma and LXQt, with an emphasis on elegance, usability and practicality. \
Its homepage is https://github.com/tsujan/Kvantum. \
 \
Kvantum also comes with extra themes that can be selected and activated by using Kvantum Manager. \
 \
This package provides Kvantum theme engine for Qt5."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "kvantum-qt5-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "39380454afb538f047be2a3658e0f2cc896443a2d3f1fc700a22220f5ce3760f797c3137c8e90e796e019dfd5ca5d049b521df809afdf12cc8a03ea3a13035b5"

RPROVIDES:${PN} += "kvantum-qt5 \
kvantum-qt5(aarch-64) \
libkvantum.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
