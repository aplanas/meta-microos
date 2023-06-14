SUMMARY = "SQLCipher Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlcipher-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "d7f1558271a4e1f950129ce0fb83633fe9309e018885ec48ce6ddb5e30361d0432095c7eefc5fa5e9d70f1795fcf0b43913644241482ecefb37fc47ac845d0dc"

RPROVIDES:${PN} += "libgda-6-0-sqlcipher \
libgda-sqlcipher \
libgda-sqlcipher-6.0.so"

RDEPENDS:${PN} += "libgda-6-0-6-0-0 \
libgda-6-0-sqlite \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlcipher-3.41.2.so.0"

inherit rpm
