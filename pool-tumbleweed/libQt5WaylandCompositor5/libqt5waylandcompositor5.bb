SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde55"

RPM_NAME = "libQt5WaylandCompositor5-5.15.9+kde55-1.1.aarch64.rpm"
RPM_HASH = "2722217140881a52c9e92e4a55db1b9938ca9e2382db9d6cc85d0ba307fe08412304b33d418b01eb19825409a52419810931c83510a303b6792bee9ba2b81ee6"

RPROVIDES:${PN} += "libQt5WaylandCompositor.so.5()(64bit) \
libQt5WaylandCompositor.so.5(Qt_5)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.0)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.1)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.10)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.11)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.12)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.13)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.14)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.15)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.2)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.3)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.4)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.5)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.6)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.7)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.8)(64bit) \
libQt5WaylandCompositor.so.5(Qt_5.9)(64bit) \
libQt5WaylandCompositor5 \
libQt5WaylandCompositor5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libwayland-server.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
