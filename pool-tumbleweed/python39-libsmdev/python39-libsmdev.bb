SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python39-libsmdev-20221028-2.11.aarch64.rpm"
RPM_HASH = "3cc94ee4dc5860166d7160607542a9d7528d83c2fcb25ac1dfaff2fbd2ab77899374e59b80e4b383ba018c273a0f95e7169e7df7db75142ac2c5823d6c5c792b"

RPROVIDES:${PN} += "python39-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
