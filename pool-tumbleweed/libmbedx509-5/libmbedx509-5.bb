SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "libmbedx509-5-3.4.1-1.1.aarch64.rpm"
RPM_HASH = "e679a406d2e6dc09bccf11d10ca67a7210a8eeb16fa6f18918d53b58097ebee57fd1c6145a5c4e3a32bb81f7c526b319c90b2240eeb82356ecff4bfca9cdf9f7"

RPROVIDES:${PN} += "libmbedx509-5 \
libmbedx509.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.14"

inherit rpm
