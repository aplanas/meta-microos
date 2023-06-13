SUMMARY = "MariaDB back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for MariaDB."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_mysql4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "715c39322a654c2301676e10483673b99c2f2e34eca053837e436bbd752ecd7ff8f1462327cf4ea41db774885680393c87ba2f40eeff3ef4eba838d7c1af8929"

RPROVIDES:${PN} += "libsoci4_0-backend \
libsoci_mysql.so.4.0()(64bit) \
libsoci_mysql4_0 \
libsoci_mysql4_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libsoci_core.so.4.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
