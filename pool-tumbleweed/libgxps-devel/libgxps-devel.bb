SUMMARY = "Development files for libgxps, a XPS document render library"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2"

RPM_NAME = "libgxps-devel-0.3.2-1.11.aarch64.rpm"
RPM_HASH = "9bb9bfe73ae59b8b972e6666b51ad94475fb04c43a811de099fbedfd6e59b0ad5cccab38505380af37deb5a0a6691f070ab5a1fb307d082dd7678c544e6eff8e"

RPROVIDES:${PN} += "libgxps-devel \
libgxps-devel(aarch-64) \
pkgconfig(libgxps)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgxps2 \
pkgconfig(cairo) \
pkgconfig(gio-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libarchive) \
typelib-1_0-GXPS-0_1"

inherit rpm
