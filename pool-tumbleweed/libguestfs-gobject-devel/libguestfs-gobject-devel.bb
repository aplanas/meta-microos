SUMMARY = "GObject bindings for libguestfs"
DESCRIPTION = "libguestfs-gobject contains GObject bindings for libguestfs. \
 \
This package is needed if you want to write software using the \
GObject bindings.  It also contains GObject Introspection information."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-gobject-devel-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "9f4bf9eaf0190972fee81cd6ee41adc07d76ac2f77f607f5d7a4994f502d0113fa2c3c582be4f5a6ad1f3871d527eb3df836806322a4ca009525c4a366b2ffdf"

RPROVIDES:${PN} += "libguestfs-gobject-devel \
libguestfs-gobject-devel(aarch-64) \
pkgconfig(libguestfs-gobject-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libguestfs-gobject-1_0 \
pkgconfig(gio-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libguestfs)"

inherit rpm
