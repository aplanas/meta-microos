SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0"

PV = "2.28.4"

RPM_NAME = "mbedtls-2-devel-2.28.4-1.1.aarch64.rpm"
RPM_HASH = "2c08f44f5962ad50948756b310ffaf2809bfb8a9e8fdb5facb2550097a6fbe0f7455eca11f52c5ee70a702d06947594634c550c46453c1aca342dc7779ccb85c"

RPROVIDES:${PN} += "mbedtls-2-devel \
mbedtls-devel"

RDEPENDS:${PN} += "libmbedcrypto7 \
libmbedtls14 \
libmbedx509-1"

inherit rpm
