SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python310-libsmraw-20230320-1.7.aarch64.rpm"
RPM_HASH = "b4de5d904eb30a49922a840ebeec37cd89be2369721cc114663abd35d784afd0efc44a7cc0442f908aec9ff978eb34c15e65a0b0b8dc63bd28367bc590bf2d50"

RPROVIDES:${PN} += "python310-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
