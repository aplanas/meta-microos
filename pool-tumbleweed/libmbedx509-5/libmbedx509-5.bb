SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "libmbedx509-5-3.4.0-3.1.aarch64.rpm"
RPM_HASH = "d91d2c93033b3c785bf1effddd024c07e08d1a3e1980a4646c637270932c3a308a19ecf01157c1117176a8fc2812a02604cb97b684e34d6bb4cb3901c633d61e"

RPROVIDES:${PN} += "libmbedx509-5 \
libmbedx509-5(aarch-64) \
libmbedx509.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libmbedcrypto.so.14()(64bit)"

inherit rpm
