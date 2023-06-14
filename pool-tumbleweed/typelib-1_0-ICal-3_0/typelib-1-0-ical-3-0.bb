SUMMARY = "Introspection bindings for libical"
DESCRIPTION = "This package provides the gobject-introspection bindings for libical."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "typelib-1_0-ICal-3_0-3.0.16-1.3.aarch64.rpm"
RPM_HASH = "28cc872dacc38858769ddac843a71e8075d202bf637d17b780076bcdcbee02276e9afda913ea63300630a7f64accf6a971c73463d37f67aced7b286e15bc672c"

RPROVIDES:${PN} += "typelib-1-0-ICal-3-0 \
typelib-ICal"

RDEPENDS:${PN} += "libical.so.3 \
typelib-GLib \
typelib-GObject"

inherit rpm
