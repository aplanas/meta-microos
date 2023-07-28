SUMMARY = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
DESCRIPTION = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
LICENSE = "MIT"

PV = "0.6.2.2"

RPM_NAME = "libcjose0-0.6.2.2-1.1.aarch64.rpm"
RPM_HASH = "e4aba0fd4e864143784665c9b27ea1e3f919a01bd967136e714e8db021402e6d19f73c94b25810125bff2e640368839430757b9922c25ea6069b142bd0604eb1"

RPROVIDES:${PN} += "libcjose.so.0 \
libcjose0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjansson.so.4"

inherit rpm
