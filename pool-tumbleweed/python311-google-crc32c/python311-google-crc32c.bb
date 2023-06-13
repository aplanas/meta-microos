SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-google-crc32c-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "55615554279bf7697bfbd120ce283ea0a6f2ca682cc28c270f0ee2b936b8232eba81c26ca17d109a653d2fa3bf184abd35df4ba5583f434226580c712521c5d3"

RPROVIDES:${PN} += "python3.11dist(google-crc32c) \
python311-google-crc32c \
python311-google-crc32c(aarch-64) \
python3dist(google-crc32c)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrc32c.so.1()(64bit) \
python(abi)"

inherit rpm
