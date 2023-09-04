SUMMARY = "Database for recording the last logged in users and system reboots"
DESCRIPTION = "pam_wtmpdb and wtmpdb are Y2038-safe versions of wtmp and the last \
utility. pam_wtmpdb collects all data in a sqlite3 database and the \
wtmpdb utility creates boot and shutdown entries or formats and \
prints the contents of the wtmp database."
LICENSE = "BSD-2-Clause"

PV = "0.9.1"

RPM_NAME = "wtmpdb-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "188f06ce55752b4e47600f0c3d63e93bda3a9d255c408b943b31293292461114cb6b8b3d94dd9de5cc61bc6ca3c44fb65d46950977a02acf6dd2f50a02d19544"

RPROVIDES:${PN} += "util-linux-/usr/bin/last \
wtmpdb"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam.so.0 \
libwtmpdb.so.0 \
pam-config"

inherit rpm
