SUMMARY = "C library for the MaxMind DB file format"
DESCRIPTION = "The libmaxminddb library provides a C library for reading MaxMind DB \
files, including the GeoIP2 databases from MaxMind. This is a \
custom binary format designed to facilitate fast lookups of IP \
addresses while allowing for great flexibility in the type of \
data associated with an address."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "libmaxminddb0-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "a7773602ac5d5a0ac14653df0066e95a0f1150691f02d515eafb8418b3c43b957006d12d82081852529716e34cea881643dbe5d0058d83a614eed06671f66cd2"

RPROVIDES:${PN} += "libmaxminddb.so.0()(64bit) \
libmaxminddb0 \
libmaxminddb0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
