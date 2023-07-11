SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-qt5-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-qt5-devel-0.6-1.8.aarch64.rpm"
RPM_HASH = "820d23d349491773e29fac95654228ed82e30b5cd2c21b5396b4c59e859cba512e864aa81cde52561664fa18169a20b598956e757f9db965d2a67dd256698c62"

RPROVIDES:${PN} += "libportal-qt5-devel \
pkgconfig-libportal-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5X11Extras \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-libportal"

inherit rpm
