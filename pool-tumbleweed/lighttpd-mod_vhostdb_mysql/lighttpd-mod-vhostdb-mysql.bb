SUMMARY = "MySQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With MySQL based vhosting you can put the information where to look for \
the document-root of a given host into a MySQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_mysql-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "23dec61fe1e5aee365a9b545176708ce720018af9e0091f36d95276b67b8faa20051ca052309812ad6851b89d14861486660af7bf3843559f54924195d6b7968"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-mysql"

RDEPENDS:${PN} += "libc.so.6 \
libmariadb.so.3 \
lighttpd"

inherit rpm
