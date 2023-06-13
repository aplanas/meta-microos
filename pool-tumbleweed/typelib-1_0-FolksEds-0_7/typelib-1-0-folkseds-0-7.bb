SUMMARY = "Introspection bindings for libfolks-eds"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "typelib-1_0-FolksEds-0_7-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "1c319c3e36d13ea3d9cff24a3c69b71ffa63a15e982c87334692468c2ec411654b60501d0dc1620697c976ee8b04ac02c1c9293f569a8b638dbb349036a6880e"

RPROVIDES:${PN} += "typelib(FolksEds) \
typelib-1_0-FolksEds-0_7 \
typelib-1_0-FolksEds-0_7(aarch-64)"

RDEPENDS:${PN} += "typelib(Camel) \
typelib(EBookContacts) \
typelib(EDataServer) \
typelib(Folks) \
typelib(GLib) \
typelib(GObject) \
typelib(Gee) \
typelib(Gio) \
typelib(Soup) \
typelib(libxml2)"

inherit rpm
