SUMMARY = "Kea MySQL database library"
DESCRIPTION = "Kea's database library for MySQL."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-mysql53-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "d42eca7c89ce78a40d67e1f0291cd754663361d0ce745645bbdab52a77562853de7c23b1642e3e844cb9eeaeeee354e240f54c7f278fd6018b2486985063f286"

RPROVIDES:${PN} += "libkea-mysql.so.53 \
libkea-mysql53"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-database.so.48 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libkea-util.so.68 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
