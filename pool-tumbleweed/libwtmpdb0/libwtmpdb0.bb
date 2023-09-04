SUMMARY = "PAM module to store login and logout of users"
DESCRIPTION = "The libwtmpdb provides various interfaces to read, write or modify \
the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.9.1"

RPM_NAME = "libwtmpdb0-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "91a4a98ac6825d0b3268653ea7238b39f69d1fdfee52a7b9c55dc8748f3538f4959ca5a8c2dd81cfd437fab7faaa2ed1a0c6e6f491c13f982c104cebad7cbc2a"

RPROVIDES:${PN} += "libwtmpdb.so.0 \
libwtmpdb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
