SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0"

PV = "2.28.3"

RPM_NAME = "libmbedx509-1-2.28.3-2.1.aarch64.rpm"
RPM_HASH = "ab430bcd84fd6c2a43c9be9bbdf512cbff965b5339cbd940351021bb585f90d1e16057dcc696872841a08460e24c01e85e62a9645e2e52a32141c2bdd2103498"

RPROVIDES:${PN} += "libmbedx509-1 \
libmbedx509-1(aarch-64) \
libmbedx509.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmbedcrypto.so.7()(64bit)"

inherit rpm
