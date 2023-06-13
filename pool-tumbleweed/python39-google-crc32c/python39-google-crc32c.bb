SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-google-crc32c-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "ee608aeaaa78ec5333b0712b272375c80954652474b3eefbb8a2cc768f370b5e228db85b7a7c44a4ca9710b3d6f485279f87ead412f92b0c2c47ff619f404f90"

RPROVIDES:${PN} += "python3.9dist(google-crc32c) \
python39-google-crc32c \
python39-google-crc32c(aarch-64) \
python3dist(google-crc32c)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrc32c.so.1()(64bit) \
python(abi)"

inherit rpm
