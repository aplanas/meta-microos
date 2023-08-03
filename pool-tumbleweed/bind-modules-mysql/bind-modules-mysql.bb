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

RPM_NAME = "bind-modules-mysql-9.18.17-1.1.aarch64.rpm"
RPM_HASH = "a1ec54fb4a07b010eff1162bb62f509ab899ed0432ef5056242bf7abc246fba14818b991d76ee8bb980f533fc392c82df7f18932ae8d69b69764e863180f3621"

RPROVIDES:${PN} += "bind-modules-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
