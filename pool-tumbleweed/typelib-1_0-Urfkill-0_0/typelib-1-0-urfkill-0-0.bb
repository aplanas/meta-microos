SUMMARY = "The urfkill glib library-- Introspection bindings"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop. \
 \
This package provides the GObject Introspection bindings for urfkill."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "typelib-1_0-Urfkill-0_0-0.5.0-3.6.aarch64.rpm"
RPM_HASH = "643d31dc651e4a4b85d03f85b0f719fa67b45f840e3686e3fb2fe7d65ed3e9a53c3fb2e4c8e60394953738f3043947324fffebb8365d6225dc73f78c2188f0ed"

RPROVIDES:${PN} += "typelib(Urfkill) \
typelib-1_0-Urfkill-0_0 \
typelib-1_0-Urfkill-0_0(aarch-64)"

RDEPENDS:${PN} += "liburfkill-glib.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
