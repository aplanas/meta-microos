SUMMARY = "Introspection bindings for the NetworkManager client convenience library"
DESCRIPTION = "This package contains the gi-bindings that make it easier to use some \
Network Manager functionality from applications that use glib. \
 \
This package provides the GObject Introspection bindings for the \
NetworkManager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "typelib-1_0-NM-1_0-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "dbbe556531622ab19e5034b2d5a396ca5d8521933831ff712e7ecb367cb0c8a0b565d72c1ab42e904491a892653e1a5c4cc9384ec8f66ca8f3a3ac1607786ab7"

RPROVIDES:${PN} += "typelib-1-0-NM-1-0 \
typelib-NM"

RDEPENDS:${PN} += "libnm.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
