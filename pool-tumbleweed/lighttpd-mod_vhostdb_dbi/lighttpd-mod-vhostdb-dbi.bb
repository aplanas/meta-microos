SUMMARY = "DBI based virtual hosts module for Lighttpd"
DESCRIPTION = "With DBI based vhosting you can put the information where to look for \
the document-root of a given host into any DBI supported database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_dbi-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "e4a299e16038042bd147a5b913e3cecef930b56517b2a21e78c03a968404cf7e0c62050039a43f36a31456143bf4bb9918e81cd404e579f4217e13c1cc293320"

RPROVIDES:${PN} += "lighttpd-mod-vhostdb-dbi"

RDEPENDS:${PN} += "libc.so.6 \
libdbi.so.3 \
lighttpd"

inherit rpm
