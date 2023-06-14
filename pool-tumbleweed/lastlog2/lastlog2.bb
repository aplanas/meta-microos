SUMMARY = "Reports most recent login of users"
DESCRIPTION = "pam_lastlog2 and lastlog2 are Y2038 safe versions of the old lastlog utility. pam_lastlog2 collects all data in a sqlite3 database and lastlog2 formats and prints the contents. The username, port, and last login time will be printed."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "lastlog2-1.1.0-2.1.aarch64.rpm"
RPM_HASH = "0a29662e32be204395f74fa9f6edd9ccaa7039b50728b2537cd8fefe054f0934ec8f251c5d0f87a735156b3f6a93cc4db2e37bf7c1ce9706cd8fc65e4fe2011b"

RPROVIDES:${PN} += "lastlog2"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblastlog2.so.1 \
libpam.so.0 \
pam-config"

inherit rpm
