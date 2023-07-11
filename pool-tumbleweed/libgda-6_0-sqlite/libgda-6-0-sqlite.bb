SUMMARY = "Sqlite Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlite-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "8741c4e160994805570c80609367b7c891280145c019b9fa68855075a5456a76c5e2c3893c374a48634fa922b7a29970548daeead0e9900998a82fe9ed7f7b49"

RPROVIDES:${PN} += "libgda-6-0-sqlite \
libgda-sqlite \
libgda-sqlite-6.0.so"

RDEPENDS:${PN} += "libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
