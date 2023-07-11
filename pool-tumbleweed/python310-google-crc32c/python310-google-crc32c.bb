SUMMARY = "A python wrapper of the C library 'Google CRC32C'"
DESCRIPTION = "A python wrapper of the C library 'Google CRC32C'."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-google-crc32c-1.5.0-1.6.aarch64.rpm"
RPM_HASH = "977c573b6f6c3ffbeacbcf46ad4e92ef2f1fec9e8191b87bb4401efc144b179156c31886415607a3a29179f203fb3b3898fc80b6f2724dd66eb2dc078c88c5c5"

RPROVIDES:${PN} += "python3.10dist-google-crc32c \
python310-google-crc32c \
python3dist-google-crc32c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrc32c.so.1 \
python-abi"

inherit rpm
