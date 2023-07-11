SUMMARY = "Introspection bindings for the malcontent system library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "typelib-1_0-Malcontent-0-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "55c965343cce34a1223f73b63f68b919aba67b3897076d867d3e55bc9b2bf0100da0627db42123a19351d8cbe3c1c6fa4f833629ad426acc9160c5be0c146ad2"

RPROVIDES:${PN} += "typelib-1-0-Malcontent-0 \
typelib-Malcontent"

RDEPENDS:${PN} += "libmalcontent-0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
