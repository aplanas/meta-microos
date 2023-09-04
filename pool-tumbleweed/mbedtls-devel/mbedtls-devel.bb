SUMMARY = "Development files for mbedtls, a SSL/TLS library"
DESCRIPTION = "This subpackage contains the development files for mbedtls, \
a suite of libraries for cryptographic functions and the \
SSL/TLS protocol suite."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "mbedtls-devel-3.4.1-1.1.aarch64.rpm"
RPM_HASH = "5d375a5f475c3d93d10c92d861ea0e88209e90cec8cbee7596a03f7afd3e083e654f9773bb38a7dcdc8546fc2b1a1cc04a544851958ac4acd9b2172a1ac209e4"

RPROVIDES:${PN} += "cmake-MbedTLS \
mbedtls-devel"

RDEPENDS:${PN} += "libmbedcrypto14 \
libmbedtls19 \
libmbedx509-5"

inherit rpm
