SUMMARY = "PostgreSQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With PostgreSQL based vhosting you can put the information where to look \
for the document-root of a given host into a PostgreSQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_pgsql-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "ed4713b266371acfea922268d185abaa52f8767941bcad89d446ad9c922900b7487776b28a0d3f27b67b244bb3df030956ddb0c1f9e7cef0bf1e1a3c8fc36e1e"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-pgsql"

RDEPENDS:${PN} += "libc.so.6 \
libpq.so.5 \
lighttpd"

inherit rpm
