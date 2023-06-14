SUMMARY = "A GTK widget for VNC clients -- Development Files"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "gtk-vnc-devel-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "d3d3808c9a830cddf195e6f9bde7a82864c6b3241f2f5dd9840e8d5990220f1ae53df621cad6f34bb14011d79f8204bedf584f182f7463958a9786327a80c7fe"

RPROVIDES:${PN} += "gtk-vnc-devel \
pkgconfig-gtk-vnc-2.0 \
pkgconfig-gvnc-1.0 \
pkgconfig-gvncpulse-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtk-vnc-2-0-0 \
libgvnc-1-0-0 \
libgvncpulse-1-0-0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gnutls \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gvnc-1.0 \
pkgconfig-libgcrypt \
pkgconfig-libpulse-simple \
pkgconfig-libsasl2 \
pkgconfig-x11 \
pkgconfig-zlib \
typelib-1-0-GVnc-1-0 \
typelib-1-0-GVncPulse-1-0 \
typelib-1-0-GtkVnc-2-0"

inherit rpm
