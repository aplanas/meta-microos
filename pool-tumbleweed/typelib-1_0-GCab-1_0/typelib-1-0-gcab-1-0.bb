SUMMARY = "Introspection bindings for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package contains the introspection files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "typelib-1_0-GCab-1_0-1.5-1.6.aarch64.rpm"
RPM_HASH = "e656bfdc3683493a386d51cab63a621f99b1fd50f3281952bc8b63e8df515426df9912c991c411947e3b2527fec2dfdff46098fa11559da0c312a560ebb4dc5c"

RPROVIDES:${PN} += "typelib-1-0-GCab-1-0 \
typelib-GCab"

RDEPENDS:${PN} += "libgcab-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
