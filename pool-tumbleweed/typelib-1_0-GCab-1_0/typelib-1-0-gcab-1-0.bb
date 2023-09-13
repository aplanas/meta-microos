SUMMARY = "Introspection bindings for the gcab cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package contains the introspection files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "typelib-1_0-GCab-1_0-1.6-1.1.aarch64.rpm"
RPM_HASH = "447dc7e909f1c2942ea659888f56b83873c3b5169fb400582fb6bab450e39864c6ca00b30ad14592d609f896b881d0b2fd0b4c6cf067874889cbad78e6153b25"

RPROVIDES:${PN} += "typelib-1-0-GCab-1-0 \
typelib-GCab"

RDEPENDS:${PN} += "libgcab-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
