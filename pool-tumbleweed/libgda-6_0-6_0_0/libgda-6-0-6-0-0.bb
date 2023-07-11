SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-6_0_0-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "8c1a6bcb57ae1cc9e430c9bbabcf11e8075c05274d67d243fdb2ea7f402922b17f6fa61269dd2d9184d5d82f52974550ae46ad60f2e3fc5870e770acf469f624"

RPROVIDES:${PN} += "libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
