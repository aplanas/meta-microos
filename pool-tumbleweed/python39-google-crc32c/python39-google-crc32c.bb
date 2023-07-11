SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python39-google-crc32c-1.5.0-1.6.aarch64.rpm"
RPM_HASH = "fc42458bebe64aa84cdbde57d4f5204ccc8ae22918a5b5b8729b2eca39fe471272cecc14bf71e631e8dd42030f73556ebdb0542369035b601d2fcdbaface0b22"

RPROVIDES:${PN} += "python3.9dist-google-crc32c \
python39-google-crc32c \
python3dist-google-crc32c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrc32c.so.1 \
python-abi"

inherit rpm
