SUMMARY = "Introspection bindings for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "typelib-1_0-Folks-0_7-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "43644cd07fae3fc9739189fdc212677c37e1c4b1886c585eef580c7088e4ce932a1be31d47f9839343c55a03849cb2c077f720a98228054e4d77ef1ab852bab8"

RPROVIDES:${PN} += "typelib(Folks) \
typelib(FolksDummy) \
typelib-1_0-Folks-0_7 \
typelib-1_0-Folks-0_7(aarch-64)"

RDEPENDS:${PN} += "typelib(GLib) \
typelib(GObject) \
typelib(Gee) \
typelib(Gio)"

inherit rpm
