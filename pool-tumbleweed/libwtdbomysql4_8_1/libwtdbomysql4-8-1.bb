SUMMARY = "MySQL back-end for the Wt::Dbo ORM library"
DESCRIPTION = "This package contains the MySQL back-end for the Wt::Dbo ORM library."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbomysql4_8_1-4.8.1-3.6.aarch64.rpm"
RPM_HASH = "23fec368ce9a6cddb6f4db3f55d437ffd1f9a9a3bf84a490b790c1a8e323e9bd1654fcc3b12b3d2d7cc8de67cde7fcdb634b9cdf25df906bba295f3c27c85a7e"

RPROVIDES:${PN} += "libwtdbomysql.so.4.8.1 \
libwtdbomysql4-8-1 \
wt-dbo-mysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
libwtdbo.so.4.8.1"

inherit rpm
