SUMMARY = "Qt 6 Svg library"
DESCRIPTION = "The Qt 6 Svg library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Svg6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bb01839abe4c475bccf97f7fd63ad45ffebc19461f92a9600bce4a60a528e41c1e7f1bf01735ff8fb9dbf7173e14d8c1e052117d0f4433b9eabddc6d8b1df230"

RPROVIDES:${PN} += "libQt6Svg.so.6()(64bit) \
libQt6Svg.so.6(Qt_6)(64bit) \
libQt6Svg.so.6(Qt_6.0)(64bit) \
libQt6Svg.so.6(Qt_6.1)(64bit) \
libQt6Svg.so.6(Qt_6.2)(64bit) \
libQt6Svg.so.6(Qt_6.3)(64bit) \
libQt6Svg.so.6(Qt_6.4)(64bit) \
libQt6Svg.so.6(Qt_6.5)(64bit) \
libQt6Svg.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Svg6 \
libQt6Svg6(aarch-64) \
libqsvg.so()(64bit) \
libqsvg.so(Qt_6)(64bit) \
libqsvg.so(Qt_6.0)(64bit) \
libqsvg.so(Qt_6.1)(64bit) \
libqsvg.so(Qt_6.2)(64bit) \
libqsvg.so(Qt_6.3)(64bit) \
libqsvg.so(Qt_6.4)(64bit) \
libqsvg.so(Qt_6.5)(64bit) \
libqsvg.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqsvgicon.so()(64bit) \
libqsvgicon.so(Qt_6)(64bit) \
libqsvgicon.so(Qt_6.0)(64bit) \
libqsvgicon.so(Qt_6.1)(64bit) \
libqsvgicon.so(Qt_6.2)(64bit) \
libqsvgicon.so(Qt_6.3)(64bit) \
libqsvgicon.so(Qt_6.4)(64bit) \
libqsvgicon.so(Qt_6.5)(64bit) \
libqsvgicon.so(Qt_6.5.1_PRIVATE_API)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm
