SUMMARY = "Development files for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package contains the files needed for building applications using \
VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.2"

RPM_NAME = "vte-devel-0.72.2-1.1.aarch64.rpm"
RPM_HASH = "935cdf982026983f1800638c845e75cba1570be2acc7b069e3977a7072d439d6d7a27d47b719694096b04dc207010c1476e0a73bc5e6635e724d1b56133319b8"

RPROVIDES:${PN} += "pkgconfig-vte-2.91 \
pkgconfig-vte-2.91-gtk4 \
vte-devel \
vte-doc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvte-2-91-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk4 \
pkgconfig-pango \
typelib-1-0-Vte-2-91 \
typelib-1-0-Vte-3-91"

inherit rpm
