SUMMARY = "PostgreSQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-postgres-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "ed812671b478530875f8dd0b8df2f9f244ba88e85f94fcd3723ebc2ba1ec61c98ce50ce5d89e3194e166a33093209894f915a946ca2507c67e0b99b12eaccd24"

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
