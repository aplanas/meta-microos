SUMMARY = "PostgreSQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With PostgreSQL based vhosting you can put the information where to look \
for the document-root of a given host into a PostgreSQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_pgsql-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "0355a6a14ef794243e10312b0bc68998d84935a8ef758daf96ff2333b8edaeeb5aa82825694ca8475bfed7754a42203e12076fb1592c884e8fdd43a3205bf1d2"

RPROVIDES:${PN} += "lighttpd-mod_vhostdb_pgsql \
lighttpd-mod_vhostdb_pgsql(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libpq.so.5()(64bit) \
lighttpd"

inherit rpm
