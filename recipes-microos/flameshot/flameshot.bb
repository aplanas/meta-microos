SUMMARY = "Screenshot software"
DESCRIPTION = "A program to capture screenshots. \
 \
Features: \
 \
 * Customizable appearance \
 * Annotation and drawing tools \
 * DBus interface \
 * Export to file, web"
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-12.1.0-2.1.aarch64.rpm"
RPM_HASH = "4d94f500d81b8e5d6528bc92a707dfe4e1b1130e7b8180f5d41b34fbc79198f4d79f2feb6d9be714b16be6dac692154d62b3475957dc40f32b854e44be8485a3"

RPROVIDES:${PN} += "application() application(org.flameshot.Flameshot.desktop) flameshot flameshot(aarch-64) metainfo() metainfo(org.flameshot.Flameshot.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5GuiAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
