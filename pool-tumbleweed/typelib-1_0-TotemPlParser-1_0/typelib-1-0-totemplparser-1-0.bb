SUMMARY = "Introspection bindings for the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too. \
 \
This package provides the GObject Introspection bindings for the \
totem-pl-parser library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "typelib-1_0-TotemPlParser-1_0-3.26.6-2.9.aarch64.rpm"
RPM_HASH = "63e15250476ba5ee3beab9fa54d6ca10aa979d5784b2a3f61073fd2812225d1b86780865e5afc8c3349b6543451e626bc2c35ad1e202a7964058f73747d00efb"

RPROVIDES:${PN} += "typelib-1-0-TotemPlParser-1-0 \
typelib-TotemPlParser"

RDEPENDS:${PN} += "libtotem-plparser.so.18 \
totem-pl-parser \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
