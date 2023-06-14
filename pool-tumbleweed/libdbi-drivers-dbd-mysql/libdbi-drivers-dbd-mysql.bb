SUMMARY = "MySQL driver for libdbi"
DESCRIPTION = "This driver provides connectivity to MySQL database servers through \
the libdbi database independent abstraction layer. Switching a \
program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-mysql-0.9.0.g53-3.18.aarch64.rpm"
RPM_HASH = "f3f49b4352814fab6b1acd0f9f1ebbcee3eaac206e2f4da300bfdfa0868bdff797df1228abbb5c0b6c4f01d568750d1ecdf8cea35334fe2232642491e9b00b69"

RPROVIDES:${PN} += "libdbdmysql.so \
libdbi-drivers-dbd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libmariadb.so.3"

inherit rpm
