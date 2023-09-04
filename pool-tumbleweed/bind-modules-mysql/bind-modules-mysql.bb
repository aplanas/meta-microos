SUMMARY = "DLZ modules which store zone data in a MySQL database"
DESCRIPTION = "This package includes dynamically loadable zone (DLZ) plugins \
which store zone data in a MySQL database \
The dlz_mysql_dynamic.so plugin does not support dynamic updates \
the dlz_mysqldyn_mod.so plugin is a dynamically loadable zone (DLZ) \
plugin that uses a fixed-schema MySQL database for back-end storage. \
It allows zone data to be updated via dynamic DNS updates, and \
sends DNS NOTIFY packets to other name servers when appropriate."
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-modules-mysql-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "81d03828487243f91706ecf0b33f8afa8cb8fbac780258409fbe8ab5836f68c549a0198c23c84d5242b5b893592913011e8ec0f2216a7d3463b56ce953ddf74f"

RPROVIDES:${PN} += "bind-modules-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
