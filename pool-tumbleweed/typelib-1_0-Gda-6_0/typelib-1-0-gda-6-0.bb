SUMMARY = "GNU Data Access (GDA) Library -- Introspection bindings"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides the GObject Introspection bindings for \
libgda."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "typelib-1_0-Gda-6_0-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "950cacdbf464bf1e18861f10a296bcd0170b5bc620a39100c56075c587d22be8997d08d961561b7f0727a3c414a7e7fd23134e6ca95ebf71cfa564dfb3ee44aa"

RPROVIDES:${PN} += "typelib-1-0-Gda-6-0 \
typelib-Gda"

RDEPENDS:${PN} += "libgda-6.0.so.6.0.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
