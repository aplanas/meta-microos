SUMMARY = "DBI based virtual hosts module for Lighttpd"
DESCRIPTION = "With DBI based vhosting you can put the information where to look for \
the document-root of a given host into any DBI supported database."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_vhostdb_dbi-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "c4a16f9b6baf681a15ac9766c808f00c8a9d1b690e2bdfedc4f8738c56b4bb0c3f8ee574b4c17289f692978fed423c63949a801c393c05da80c7c8df561d5365"

RPROVIDES:${PN} += "lighttpd-mod_vhostdb_dbi \
lighttpd-mod_vhostdb_dbi(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libdbi.so.3()(64bit) \
libdbi.so.3(ABI_3)(64bit) \
lighttpd"

inherit rpm
