SUMMARY = "Database for recording the last logged in users and system reboots"
DESCRIPTION = "pam_wtmpdb and wtmpdb are Y2038-safe versions of wtmp and the last \
utility. pam_wtmpdb collects all data in a sqlite3 database and the \
wtmpdb utility creates boot and shutdown entries or formats and \
prints the contents of the wtmp database."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "wtmpdb-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "d8e7383fd165e741ba4becb061aea4dad4b421cd1b6f9123e9d9dcce8e37abd1cbf49acf757e9d6cf2452e59d1ab7c3cfb69d8eb14bc723f29d4b1184a58b15a"

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
