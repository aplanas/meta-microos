SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-google-crc32c-1.5.0-1.6.aarch64.rpm"
RPM_HASH = "1e8e217b462ee99e4f553d29da9e1462e3cb1e187b6e80d9bc5fa012556211f62194e62190d3597c401e0d19d76df34657b6c9e8d984636f4a5d6a311518e5d3"

RPROVIDES:${PN} += "python3-google-crc32c \
python3.11dist-google-crc32c \
python311-google-crc32c \
python3dist-google-crc32c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrc32c.so.1 \
python-abi"

inherit rpm
