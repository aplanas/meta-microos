SUMMARY = "Reports most recent login of users"
DESCRIPTION = "pam_lastlog2 and lastlog2 are Y2038 safe versions of the old lastlog utility. pam_lastlog2 collects all data in a sqlite3 database and lastlog2 formats and prints the contents. The username, port, and last login time will be printed."
LICENSE = "BSD-2-Clause"

PV = "1.1.0"

RPM_NAME = "lastlog2-1.1.0-2.2.aarch64.rpm"
RPM_HASH = "4026a4331c64ba60e3511b8ff0a8612008093bbc050a94b8d63bbd513e64e81f6706573832d3c5273c222914e0a137b1e454cdcf687f9402b978339af71d7ff1"

RPROVIDES:${PN} += "lastlog2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblastlog2.so.1 \
libpam.so.0 \
pam-config"

inherit rpm
