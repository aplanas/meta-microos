SUMMARY = "Development environment for cairo"
DESCRIPTION = "This package contains all files necessary to build binaries using \
cairo."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.17.8"

RPM_NAME = "cairo-devel-1.17.8-1.2.aarch64.rpm"
RPM_HASH = "5a85999f385487abf9ca47e1f76e232047142fe7e858d58ec783bc6dc77151805bfcceeaa83e7266e957baa056ec276e595d8902ef4355cd0bfcbe111d45eb39"

RPROVIDES:${PN} += "cairo-devel \
cairo-doc \
pkgconfig-cairo \
pkgconfig-cairo-fc \
pkgconfig-cairo-ft \
pkgconfig-cairo-gobject \
pkgconfig-cairo-pdf \
pkgconfig-cairo-png \
pkgconfig-cairo-ps \
pkgconfig-cairo-script \
pkgconfig-cairo-script-interpreter \
pkgconfig-cairo-svg \
pkgconfig-cairo-tee \
pkgconfig-cairo-xcb \
pkgconfig-cairo-xcb-shm \
pkgconfig-cairo-xlib \
pkgconfig-cairo-xlib-xrender"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairo-gobject2 \
libcairo-script-interpreter2 \
libcairo2 \
pkgconfig-cairo \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libpng \
pkgconfig-pixman-1 \
pkgconfig-x11 \
pkgconfig-xcb \
pkgconfig-xcb-render \
pkgconfig-xcb-shm \
pkgconfig-xext \
pkgconfig-xrender \
pkgconfig-zlib"

inherit rpm
