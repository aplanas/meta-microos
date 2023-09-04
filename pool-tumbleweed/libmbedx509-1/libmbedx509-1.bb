SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0"

PV = "2.28.4"

RPM_NAME = "libmbedx509-1-2.28.4-1.1.aarch64.rpm"
RPM_HASH = "dfd79ed618eebdf6ef2f55b3cd0416b621bf3bff373388f98fdc4cae40d5ee831e1dd1b1f49f1d4ba197a4c3ee5f964c40ec93eb6d1bff84562dc6fceb57122f"

RPROVIDES:${PN} += "libmbedx509-1 \
libmbedx509.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.7"

inherit rpm
