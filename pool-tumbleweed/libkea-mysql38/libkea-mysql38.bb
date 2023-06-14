SUMMARY = "Kea MySQL database library"
DESCRIPTION = "Kea's database library for MySQL."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-mysql38-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "602e8758ea1c5787669ead599331fc63388947d7f42bf08e6a3eb916b013d483bddac78cfff6244b3922ea12bb6cfa8032ee8e7e0c21b3892100f83a0aa17d38"

RPROVIDES:${PN} += "libkea-mysql.so.38 \
libkea-mysql38"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-database.so.35 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libkea-util.so.52 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
