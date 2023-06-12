SUMMARY = "Qt 6 SVGWidgets library"
DESCRIPTION = "The Qt 6 SvgWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6SvgWidgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c0c480cff9bb5c8bb605f4aa1561c15e1de3b3a2b43f49bf91540d6ee127459112779cfdfd3e934b697927be35797900e001cfeaa2800ecb302e78fca45fc889"

RPROVIDES:${PN} += "libQt6SvgWidgets.so.6()(64bit) \
libQt6SvgWidgets.so.6(Qt_6)(64bit) \
libQt6SvgWidgets.so.6(Qt_6.0)(64bit) \
libQt6SvgWidgets.so.6(Qt_6.1)(64bit) \
libQt6SvgWidgets.so.6(Qt_6.2)(64bit) \
libQt6SvgWidgets.so.6(Qt_6.3)(64bit) \
libQt6SvgWidgets.so.6(Qt_6.4)(64bit) \
libQt6SvgWidgets.so.6(Qt_6.5)(64bit) \
libQt6SvgWidgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6SvgWidgets6 \
libQt6SvgWidgets6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Svg.so.6()(64bit) \
libQt6Svg.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
