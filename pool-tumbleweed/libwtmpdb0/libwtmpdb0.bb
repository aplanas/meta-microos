SUMMARY = "PAM module to store login and logout of users"
DESCRIPTION = "The libwtmpdb provides various interfaces to read, write or modify the wtmpdb database."
LICENSE = "BSD-2-Clause"

PV = "0.5.0"

RPM_NAME = "libwtmpdb0-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "533ecf28a77afbae4087503fdb14cea2f5a459e818664068f0de5068464c90587d0aa9aee99d6fb20e8cc24c208c37254035e6377333ba67fc0dca2c602cf197"

RPROVIDES:${PN} += "libwtmpdb.so.0 \
libwtmpdb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
