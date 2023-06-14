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

RPM_NAME = "typelib-1_0-Gda-6_0-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "07fd6bada79a675092ef34ff3564e1621985f4d405393c95e4674f2fe471996d04c673e3eb6cc6d2449569e63ba9a9d06cc723d62fddefe0123442995169fa57"

RPROVIDES:${PN} += "typelib-1-0-Gda-6-0 \
typelib-Gda"

RDEPENDS:${PN} += "libgda-6.0.so.6.0.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
