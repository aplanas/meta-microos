SUMMARY = "MariaDB embedded server library"
DESCRIPTION = "This package contains MariaDB library that allows to run an embedded \
MariaDB server inside a client application."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "libmariadbd19-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "e8034b816ead1e8c5ab26884e964ded469d84a51ca1daa994c1d7226af09af51d9f3edeefa9cf0c331fac13a1ad5251d3ddaa1ce7a575a982990fb1903f2613e"

RPROVIDES:${PN} += "libmariadbd.so.19 \
libmariadbd19 \
libmysqld"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
mariadb-errormessages"

inherit rpm
