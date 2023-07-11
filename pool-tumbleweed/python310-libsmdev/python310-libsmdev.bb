SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python310-libsmdev-20221028-2.11.aarch64.rpm"
RPM_HASH = "6bd26214885cfc619364d7dbfa86f219e95e43deace537f6b5af7cd8bdabddde0f73006d4e2c26ecc4fbfb8e54bb4045a14cd9456827729421519f29e38cff75"

RPROVIDES:${PN} += "python310-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
