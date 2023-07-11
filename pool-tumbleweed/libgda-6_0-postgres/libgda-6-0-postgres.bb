SUMMARY = "PostgreSQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-postgres-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "7a966686ad28dc68bca54f8efa936346fd2d5448def7032f84e98fa5bed440043a04623e68edee735476d917b506244269095febb4237456b3487644d721e7c8"

RPROVIDES:${PN} += "libgda-6-0-postgres \
libgda-postgres \
libgda-postgres-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpq.so.5"

inherit rpm
