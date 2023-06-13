SUMMARY = "PostgreSQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-postgres-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "ed812671b478530875f8dd0b8df2f9f244ba88e85f94fcd3723ebc2ba1ec61c98ce50ce5d89e3194e166a33093209894f915a946ca2507c67e0b99b12eaccd24"

RPROVIDES:${PN} += "libgda-6_0-postgres \
libgda-6_0-postgres(aarch-64) \
libgda-postgres \
libgda-postgres-6.0.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libgda-6_0-6_0_0 \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpq.so.5()(64bit)"

inherit rpm
