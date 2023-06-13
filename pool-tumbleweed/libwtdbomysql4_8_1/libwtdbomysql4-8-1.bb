SUMMARY = "MySQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the MySQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbomysql4_8_1-4.8.1-3.6.aarch64.rpm"
RPM_HASH = "23fec368ce9a6cddb6f4db3f55d437ffd1f9a9a3bf84a490b790c1a8e323e9bd1654fcc3b12b3d2d7cc8de67cde7fcdb634b9cdf25df906bba295f3c27c85a7e"

RPROVIDES:${PN} += "libwtdbomysql.so.4.8.1()(64bit) \
libwtdbomysql4_8_1 \
libwtdbomysql4_8_1(aarch-64) \
wt-dbo-mysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwtdbo.so.4.8.1()(64bit)"

inherit rpm
