SUMMARY = "Introspection bindings for the GObject-based oVirt bindings"
DESCRIPTION = "GoVirt is a GObject wrapper for the oVirt REST API [1]. It will \
only provide very basic functionality as the goal is to \
autogenerate a full wrapper as it is already done for the python \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.9"

RPM_NAME = "typelib-1_0-GoVirt-1_0-0.3.9-1.3.aarch64.rpm"
RPM_HASH = "e307478daf27a0cd0a9a143012afc5f795dc4255574a9e0277575cf942d3063af0c133dbca72aebd072c45e0cd8bd9a41db6dd8d3cc0cbd6eb3a7752208cb0f3"

RPROVIDES:${PN} += "typelib(GoVirt) \
typelib-1_0-GoVirt-1_0 \
typelib-1_0-GoVirt-1_0(aarch-64)"

RDEPENDS:${PN} += "libgovirt.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Rest) \
typelib(Soup)"

inherit rpm
