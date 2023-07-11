SUMMARY = "Reports last logged in users and system reboots"
DESCRIPTION = "pam_wtmpdb and wtmpdb are Y2038 safe versions of wtmp and the last utility. pam_wtmpdb collects all data in a sqlite3 database and wtmpdb creates boot and shutdown entries or formats and prints the contents of the wtmp database."
LICENSE = "BSD-2-Clause"

PV = "0.7.0"

RPM_NAME = "wtmpdb-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "af936d7e680536b6349a549346eb0999c71fb73adbc64d76ba37ec522470f5ea30b8a1eefc3b7caca48e9b309de4058f4b0cb78169025edbe0f732ba8c44f6fd"

RPROVIDES:${PN} += "wtmpdb"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam.so.0 \
libwtmpdb.so.0 \
pam-config"

inherit rpm
