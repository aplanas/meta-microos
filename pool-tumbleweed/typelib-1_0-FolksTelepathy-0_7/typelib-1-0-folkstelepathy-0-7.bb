SUMMARY = "Introspection bindings for libfolks-telepathy"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "typelib-1_0-FolksTelepathy-0_7-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "5178fd074369e3bff442ea2ddbcc824e533e3360452a7d963d11ee018f9666848d4e7c04c58a798b0216e1433d59856ae64078c6d356d896ecc4627f4f06e973"

RPROVIDES:${PN} += "typelib(FolksTelepathy) \
typelib-1_0-FolksTelepathy-0_7 \
typelib-1_0-FolksTelepathy-0_7(aarch-64)"
RDEPENDS:${PN} += "typelib(Folks) \
typelib(GLib) \
typelib(GObject) \
typelib(Gee) \
typelib(Gio) \
typelib(TelepathyGLib)"

inherit rpm
