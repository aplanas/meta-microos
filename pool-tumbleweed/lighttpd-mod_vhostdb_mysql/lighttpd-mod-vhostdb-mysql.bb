SUMMARY = "MySQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With MySQL based vhosting you can put the information where to look for \
the document-root of a given host into a MySQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_mysql-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "731fd47591bb35207bbd8d59b9567d9639f983bbeb2b4d3f79bc18e5f730e16f063e89ec17a81f64dc07aa1e590c2525d4b1c516ae78c880d9334a96906f99d6"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-mysql"

RDEPENDS:${PN} += "libc.so.6 \
libmariadb.so.3 \
lighttpd"

inherit rpm
