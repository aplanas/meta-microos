SUMMARY = "Reports last logged in users and system reboots"
DESCRIPTION = "pam_wtmpdb and wtmpdb are Y2038 safe versions of wtmp and the last utility. pam_wtmpdb collects all data in a sqlite3 database and wtmpdb creates boot and shutdown entries or formats and prints the contents of the wtmp database."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "wtmpdb-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "d34e31c2de00f370d561ddfa411f859f0d6cfe50efdbdd8787c4c7d9e8b8bbfadd8c45bce5f247c380e7f971b3faecd9b8542c08854ed9c10403a00c828576e1"

RPROVIDES:${PN} += "wtmpdb \
wtmpdb(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudit.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) \
libpam.so.0(LIBPAM_MODUTIL_1.0)(64bit) \
libwtmpdb.so.0()(64bit) \
libwtmpdb.so.0(LIBWTMPDB_0.1)(64bit) \
pam-config"

inherit rpm
