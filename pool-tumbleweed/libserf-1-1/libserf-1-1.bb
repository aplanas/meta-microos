SUMMARY = "High-Performance Asynchronous HTTP Client Library"
DESCRIPTION = "The serf library is a C-based HTTP client library built upon the Apache \
Portable Runtime (APR) library. It multiplexes connections, running the \
read/write communication asynchronously. Memory copies and transformations are \
kept to a minimum to provide high performance operation."
LICENSE = "Apache-2.0"

PV = "1.3.10"

RPM_NAME = "libserf-1-1-1.3.10-1.1.aarch64.rpm"
RPM_HASH = "cd0125342d265496b5a486fe7f771c04637fafbfefe0e6bb1fda10c5bbb7b9f60336cfb56b38d1196889487baa2375a244ef988e0df9efda491a5ae7b6f23727"

RPROVIDES:${PN} += "libserf-1-1 \
libserf-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libexpat.so.1 \
libgdbm.so.6 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libssl.so.3 \
libz.so.1"

inherit rpm
