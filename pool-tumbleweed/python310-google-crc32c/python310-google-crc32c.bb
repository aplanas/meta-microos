SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-google-crc32c-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "f0bf3764f1f5d7032d2f3ed7ea1f9aa70155e8489ca317758954a33ea41ca9605e9bfa3aa98df6cd6cc28420f34d1fc9ffb0307c99903d9f1b92b3ce5d6ab597"

RPROVIDES:${PN} += "python3-google-crc32c \
python3.10dist(google-crc32c) \
python310-google-crc32c \
python310-google-crc32c(aarch-64) \
python3dist(google-crc32c)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrc32c.so.1()(64bit) \
python(abi)"

inherit rpm
