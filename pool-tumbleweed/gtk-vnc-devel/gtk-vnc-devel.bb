SUMMARY = "A GTK widget for VNC clients -- Development Files"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "gtk-vnc-devel-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "87cbef30c016b1e42dbe48e27027b68a611c6565efd38f30c331e985555bb7c1046a2f4a791a313c69277a0528c4e7c2c8b218f488d8e1055449531118849959"

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
