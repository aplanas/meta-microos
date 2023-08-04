SUMMARY = "DLZ modules which store zone data in a MySQL database"
DESCRIPTION = "This package includes dynamically loadable zone (DLZ) plugins \
which store zone data in a MySQL database \
The dlz_mysql_dynamic.so plugin does not support dynamic updates \
the dlz_mysqldyn_mod.so plugin is a dynamically loadable zone (DLZ) \
plugin that uses a fixed-schema MySQL database for back-end storage. \
It allows zone data to be updated via dynamic DNS updates, and \
sends DNS NOTIFY packets to other name servers when appropriate."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-mysql-9.18.17-1.2.aarch64.rpm"
RPM_HASH = "f5657ea0febfc8b665f63b9b5b0bfa59943f4edcd0731deadc625ee0dc347d20c94cb9f9480c41fd90891dbfe5e5c1a271bfde55c0dac663a1c6dc2685174e52"

RPROVIDES:${PN} += "bind-modules-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
