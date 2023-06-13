SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-gtk3-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk3-devel-0.6-1.7.aarch64.rpm"
RPM_HASH = "b238dabea5a55fb1fb46085fce19dc38f7321225a28f3e3be14132420321c384357a46e7fe50e4b87cb236ec5daea383a2d24bfeb2ef1521e553580daf65ecce"

RPROVIDES:${PN} += "libportal-gtk3-devel \
libportal-gtk3-devel(aarch-64) \
pkgconfig(libportal-gtk3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk3-1 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libportal) \
typelib-1_0-XdpGtk3-1_0"

inherit rpm
