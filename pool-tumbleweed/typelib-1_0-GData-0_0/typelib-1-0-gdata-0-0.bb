SUMMARY = "Introspection bindings for libgdata"
DESCRIPTION = "libgdata is a GLib-based library for accessing online service APIs using \
the GData protocol — most notably, Google's services. It provides APIs \
to access the common Google services, and has full asynchronous support. \
 \
This package provides the GObject Introspection bindings for the \
libgdata library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "typelib-1_0-GData-0_0-0.18.1-3.4.aarch64.rpm"
RPM_HASH = "452a0bbaa08eb6826c092d9b78c518edf25ba2e003e590b6140df4e66a930375c3bb667cae3afeb5eea3bc9f2eff6c20a22a957e83d2cea21ba54ce3f4cd5cc0"

RPROVIDES:${PN} += "typelib-1-0-GData-0-0 \
typelib-GData"

RDEPENDS:${PN} += "libgdata.so.22 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Goa \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
