SUMMARY = "GObject introspection for libgit2-glib"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "typelib-1_0-Ggit-1_0-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "df8ed0f2029f7769c1b8fd69584619fee64d70bc5f67b532bbc3a0f14dd130f79d5a440002aebaf0424c4e0e19e8c4f3b725acfd753d38d4e4d92298925915d4"

RPROVIDES:${PN} += "typelib-1-0-Ggit-1-0 \
typelib-Ggit"

RDEPENDS:${PN} += "libgit2-glib-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
