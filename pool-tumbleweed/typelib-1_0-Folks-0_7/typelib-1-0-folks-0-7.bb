SUMMARY = "Introspection bindings for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "typelib-1_0-Folks-0_7-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "d5c06f9e1091f9d205bdeb040c446b527e22b2ea58ecda33b6de96fe7975adf543d7a711ba16562d60f74c970e87946aeb4793c1d4dced3f0c906070433f493e"

RPROVIDES:${PN} += "typelib-1-0-Folks-0-7 \
typelib-Folks \
typelib-FolksDummy"

RDEPENDS:${PN} += "typelib-GLib \
typelib-GObject \
typelib-Gee \
typelib-Gio"

inherit rpm
