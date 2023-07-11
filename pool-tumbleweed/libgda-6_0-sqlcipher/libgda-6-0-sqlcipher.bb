SUMMARY = "SQLCipher Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlcipher-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "d976af5cb60c360c6f3a50866ddd1380aa47b3341a2f38db1569f8d7038b5bdeb554e5b9d1d7ed0d3d729cd3da9baad1c630d7386107aa679a477e50bbfaa0b8"

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
