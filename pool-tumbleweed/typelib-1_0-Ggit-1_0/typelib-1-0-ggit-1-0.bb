SUMMARY = "GObject introspection for libgit2-glib"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "typelib-1_0-Ggit-1_0-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "6a359e9a98efad7c9243e3b39c4ede78de4c5e705cfe446744a7eb495862cb86776455cbd698762618b0c04475f5a0b701582764a3faeac976d4c38b48b81343"

RPROVIDES:${PN} += "typelib-1-0-Ggit-1-0 \
typelib-Ggit"

RDEPENDS:${PN} += "libgit2-glib-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
