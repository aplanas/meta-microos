SUMMARY = "MySQL driver for libdbi"
DESCRIPTION = "This driver provides connectivity to MySQL database servers through \
the libdbi database independent abstraction layer. Switching a \
program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-mysql-0.9.0.g53-3.19.aarch64.rpm"
RPM_HASH = "ada624c43a32cf2b9f069568e20b4f38f847dca5b878af9efa914e6f74607cd6e2800ea63c7f5cd7e69ab432a650c64e9fd75451b065d4aa077662585c33eb6a"

RPROVIDES:${PN} += "libdbdmysql.so \
libdbi-drivers-dbd-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3 \
libmariadb.so.3"

inherit rpm
