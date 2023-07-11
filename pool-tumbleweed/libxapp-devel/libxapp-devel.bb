SUMMARY = "Development files of libxapp"
DESCRIPTION = "The libxapp development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libxapp."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "libxapp-devel-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "ae0f10e4a464cb8788b098e8e914695f8cef032d4622c502f5b89f2bfb2e1a8e6be59cf82894aa376038041e8cb00e94878a701275484c93318f3fa46b105643"

RPROVIDES:${PN} += "libxapp-devel \
libxapp-gtk3-module.so \
pkgconfig-xapp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxapp.so.1 \
libxapp1 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgnomekbdui \
pkgconfig-x11 \
pkgconfig-xkbfile \
typelib-1-0-XApp-1-0"

inherit rpm
