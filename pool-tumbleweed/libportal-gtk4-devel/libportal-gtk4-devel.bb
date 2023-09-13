SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-gtk4-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-gtk4-devel-0.7-1.1.aarch64.rpm"
RPM_HASH = "6b1fb2fb37d3bb83ab02b1e2ce5982bff6b93e6fbec1393656138e689e093777c13f527976c35239fcc7e27bd38484c9092d269a4425fb19953a9951f4e2957b"

RPROVIDES:${PN} += "libportal-gtk4-devel \
pkgconfig-libportal-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk4-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk4 \
pkgconfig-libportal \
typelib-1-0-XdpGtk4-1-0"

inherit rpm
