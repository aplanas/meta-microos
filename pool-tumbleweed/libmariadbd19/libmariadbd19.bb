SUMMARY = "MariaDB embedded server library"
DESCRIPTION = "This package contains MariaDB library that allows to run an embedded \
MariaDB server inside a client application."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "11.0.2"

RPM_NAME = "libmariadbd19-11.0.2-1.1.aarch64.rpm"
RPM_HASH = "7d975fc85b194580b8409bdf620fb22388dcdd0fa9dbd18fd978e36c728ef7abf8e67d57625d2e3378fca146397db27bb7cf64684a253920ada12ce60bd4ad64"

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
