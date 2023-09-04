SUMMARY = "Development files of libxapp"
DESCRIPTION = "The libxapp development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libxapp."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "libxapp-devel-2.6.1-1.1.aarch64.rpm"
RPM_HASH = "b08f0b474926c41370d8b5ca6a3e9e5b52e1e2fcaf214466e53f953ecf2a744b9d85e2de77aa9769fd987cfc54ed6d755eed7eb4faa3df36647a97a71489a275"

RPROVIDES:${PN} += "libxapp-devel \
libxapp-gtk3-module.so \
pkgconfig-xapp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxapp.so.1 \
libxapp1 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgnomekbdui \
pkgconfig-x11 \
pkgconfig-xkbfile \
typelib-1-0-XApp-1-0"

inherit rpm
