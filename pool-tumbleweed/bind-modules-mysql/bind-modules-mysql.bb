SUMMARY = "DLZ modules which store zone data in a MySQL database"
DESCRIPTION = "This package includes dynamically loadable zone (DLZ) plugins \
which store zone data in a MySQL database \
The dlz_mysql_dynamic.so plugin does not support dynamic updates \
the dlz_mysqldyn_mod.so plugin is a dynamically loadable zone (DLZ) \
plugin that uses a fixed-schema MySQL database for back-end storage. \
It allows zone data to be updated via dynamic DNS updates, and \
sends DNS NOTIFY packets to other name servers when appropriate."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-mysql-9.18.16-3.1.aarch64.rpm"
RPM_HASH = "3bdf38e926175f59bb93ca721acd4e22de6dfe801dfd15a3ead65e29c2c1106ed984688a3a1e53d56e57f14ba1fdeaa12e6928e28c411754bad5980346de31ce"

RPROVIDES:${PN} += "bind-modules-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
