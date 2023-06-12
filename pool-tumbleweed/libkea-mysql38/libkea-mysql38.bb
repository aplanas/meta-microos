SUMMARY = "Kea MySQL database library"
DESCRIPTION = "Kea's database library for MySQL."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-mysql38-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "602e8758ea1c5787669ead599331fc63388947d7f42bf08e6a3eb916b013d483bddac78cfff6244b3922ea12bb6cfa8032ee8e7e0c21b3892100f83a0aa17d38"

RPROVIDES:${PN} += "libkea-mysql.so.38()(64bit) \
libkea-mysql38 \
libkea-mysql38(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-database.so.35()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-log.so.35()(64bit) \
libkea-util.so.52()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
