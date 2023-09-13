SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-qt5-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-qt5-devel-0.7-1.1.aarch64.rpm"
RPM_HASH = "316298fe29c077357c236fda453dca1f27d6a9c8624111b4f11a00f330daf2c4656ce5c8b5cd26c96a2a73a8497eb8c05518eb04a2db53dccdc6a491dd610498"

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
