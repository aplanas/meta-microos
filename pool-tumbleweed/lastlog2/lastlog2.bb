SUMMARY = "Reports most recent login of users"
DESCRIPTION = "pam_lastlog2 and lastlog2 are Y2038 safe versions of the old lastlog utility. pam_lastlog2 collects all data in a sqlite3 database and lastlog2 formats and prints the contents. The username, port, and last login time will be printed."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "lastlog2-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "a25bb980461462a4eb3fe7d9ca06622773a6f1bfc60099695d6f14ebc68ebc292c6c8ffd6293316a7dc2c389179fa67d3f79cedbebdaac8b335f0ae5e27bb6db"

RPROVIDES:${PN} += "lastlog2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblastlog2.so.1 \
libpam.so.0 \
pam-config"

inherit rpm
