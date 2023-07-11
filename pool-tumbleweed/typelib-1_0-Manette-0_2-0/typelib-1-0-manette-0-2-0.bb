SUMMARY = "GObject introspection bindings for liblibmanette"
DESCRIPTION = "libmanette allows easy access to game controllers. \
This subpackage contains the gobject bindings for the liblibmanette \
shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "typelib-1_0-Manette-0_2-0-0.2.6-2.11.aarch64.rpm"
RPM_HASH = "82b83f9e306b82c63d305d4a7834a183ed04b807b5b8dfafc26e3f2efa231ca308515f3a6fb18d502ec0561ea656c086cb634b2826d3a09d07bf14edeef77ae9"

RPROVIDES:${PN} += "typelib-1-0-Manette-0-2-0 \
typelib-Manette"

RDEPENDS:${PN} += "libmanette-0.2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-GUdev \
typelib-Gio"

inherit rpm
