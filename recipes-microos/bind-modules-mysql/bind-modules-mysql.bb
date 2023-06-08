SUMMARY = "DLZ modules which store zone data in a MySQL database"
DESCRIPTION = "This package includes dynamically loadable zone (DLZ) plugins \
which store zone data in a MySQL database \
The dlz_mysql_dynamic.so plugin does not support dynamic updates \
the dlz_mysqldyn_mod.so plugin is a dynamically loadable zone (DLZ) \
plugin that uses a fixed-schema MySQL database for back-end storage. \
It allows zone data to be updated via dynamic DNS updates, and \
sends DNS NOTIFY packets to other name servers when appropriate."
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-modules-mysql-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "dd17a681edb06aba41488e3aeaefb9ef83403210d662270b669689fea96a70e9be82fb48e33d690627219d67c859ce13444f39c422087e904d1b9b46f5362a35"

RPROVIDES:${PN} += "bind-modules-mysql bind-modules-mysql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit)"

inherit rpm
