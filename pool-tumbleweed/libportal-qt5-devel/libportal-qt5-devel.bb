SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-qt5-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-qt5-devel-0.6-1.7.aarch64.rpm"
RPM_HASH = "f1f82fd0b9f639a53e87955a60c609f8291d76d535be18b2b7f17bb86699a46dae9cda5211cb51f08d6f1764252e07a172adfe1ac594ba8cb36ac5c3a97402a5"

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
