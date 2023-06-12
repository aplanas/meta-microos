SUMMARY = "Development environment for cairo"
DESCRIPTION = "This package contains all files necessary to build binaries using \
cairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.17.8"

RPM_NAME = "cairo-devel-1.17.8-1.1.aarch64.rpm"
RPM_HASH = "1eed90b3f811ba3eea6b826a056e967a5e3c3f3c98dc8ec0553ebf7447c3d7738ce43a63eb341e66f7495864e89f12992ca669461f69333ee0fc40370c41e583"

RPROVIDES:${PN} += "cairo-devel \
cairo-devel(aarch-64) \
cairo-doc \
pkgconfig(cairo) \
pkgconfig(cairo-fc) \
pkgconfig(cairo-ft) \
pkgconfig(cairo-gobject) \
pkgconfig(cairo-pdf) \
pkgconfig(cairo-png) \
pkgconfig(cairo-ps) \
pkgconfig(cairo-script) \
pkgconfig(cairo-script-interpreter) \
pkgconfig(cairo-svg) \
pkgconfig(cairo-tee) \
pkgconfig(cairo-xcb) \
pkgconfig(cairo-xcb-shm) \
pkgconfig(cairo-xlib) \
pkgconfig(cairo-xlib-xrender)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairo-gobject2 \
libcairo-script-interpreter2 \
libcairo2 \
pkgconfig(cairo) \
pkgconfig(fontconfig) \
pkgconfig(freetype2) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libpng) \
pkgconfig(pixman-1) \
pkgconfig(x11) \
pkgconfig(xcb) \
pkgconfig(xcb-render) \
pkgconfig(xcb-shm) \
pkgconfig(xext) \
pkgconfig(xrender) \
pkgconfig(zlib)"

inherit rpm
