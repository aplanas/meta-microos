SUMMARY = "Development files of libxapp"
DESCRIPTION = "The libxapp development package includes the header files, \
libraries, development tools necessary for compiling and linking \
application which will use libxapp."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "libxapp-devel-2.4.1-1.3.aarch64.rpm"
RPM_HASH = "0232bace7731eb846c6324027f6b05c1a761c891526d60d0b1a5d3a041b5f064e7fce82acd67e46110ebf5753dfe6d5800619c50f85008b82241a659ca897f0f"

RPROVIDES:${PN} += "libxapp-devel \
libxapp-devel(aarch-64) \
libxapp-gtk3-module.so()(64bit) \
pkgconfig(xapp)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxapp.so.1()(64bit) \
libxapp1 \
pkgconfig(cairo) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libgnomekbdui) \
pkgconfig(x11) \
pkgconfig(xkbfile) \
typelib-1_0-XApp-1_0"

inherit rpm
