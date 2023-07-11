SUMMARY = "Introspection bindings for the Telepathy Call channel handling library"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "typelib-1_0-TelepathyFarstream-0_6-0.6.2-2.24.aarch64.rpm"
RPM_HASH = "911ff4a08403f1e17b347e48ff0e2a7909d24264869f7f975f9da0987ed01afe05cd03e1afd22b83e3a03e3627da88798b2b691ab1ead8fd8387b0471edcba4a"

RPROVIDES:${PN} += "typelib-1-0-TelepathyFarstream-0-6 \
typelib-TelepathyFarstream"

RDEPENDS:${PN} += "libtelepathy-farstream.so.3 \
typelib-Farstream \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-TelepathyGLib"

inherit rpm
