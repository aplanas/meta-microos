SUMMARY = "Introspection bindings for aravis"
DESCRIPTION = "This package provides the GObject Introspection bindings for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "typelib-1_0-Aravis-0.8-0.8.26-1.2.aarch64.rpm"
RPM_HASH = "1ec29373d99576bd13e03d100ae719cab9710fceece2a00626ee90f67aa340049cd8781137cdf026337be787d3b0f2345f323ddb7033f98ec9527d082d041014"

RPROVIDES:${PN} += "typelib-1-0-Aravis-0.8 \
typelib-Aravis"

RDEPENDS:${PN} += "libaravis-0.8.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
