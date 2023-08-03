SUMMARY = "GObject introspection for libgit2-glib"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "typelib-1_0-Ggit-1_0-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "4f8b479f3f2a3efce87699c403cf60ad36142411a5f64a838b9f53a5025a18794b18ccc416441019afbf266be40ccefa958bdab79dd11170977cf55dcbe69e3e"

RPROVIDES:${PN} += "typelib-1-0-Ggit-1-0 \
typelib-Ggit"

RDEPENDS:${PN} += "libgit2-glib-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
