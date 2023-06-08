SUMMARY = "A better Qt application inclusion under GNOME"
DESCRIPTION = "QGnomePlatform is a Qt Platform Theme designed to use as many of the GNOME \
settings as possible in unmodified Qt applications. It allows Qt applications \
to fit into the environment as well as possible."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "QGnomePlatform-qt5-0.9.0-3.2.aarch64.rpm"
RPM_HASH = "31beb3faf790282912c4203d1de34d6b3d21599272bcbbe162812e4210b9461b1f1ff9bc2b7556c7ecf1e4f310c6fd63fc25cbd669919c7931176c492d15e86e"

RPROVIDES:${PN} += "QGnomePlatform QGnomePlatform-qt5 QGnomePlatform-qt5(aarch-64) libqgnomeplatform.so()(64bit) libqgnomeplatformdecoration.so()(64bit) libqgnomeplatformtheme.so()(64bit)"
RDEPENDS:${PN} += "adwaita-qt5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libadwaitaqt.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
