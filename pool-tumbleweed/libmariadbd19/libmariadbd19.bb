SUMMARY = "MariaDB embedded server library"
DESCRIPTION = "This package contains MariaDB library that allows to run an embedded \
MariaDB server inside a client application."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "libmariadbd19-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "e8034b816ead1e8c5ab26884e964ded469d84a51ca1daa994c1d7226af09af51d9f3edeefa9cf0c331fac13a1ad5251d3ddaa1ce7a575a982990fb1903f2613e"

RPROVIDES:${PN} += "libmariadbd.so.19()(64bit) \
libmariadbd19 \
libmariadbd19(aarch-64) \
libmysqld"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
mariadb-errormessages"

inherit rpm
