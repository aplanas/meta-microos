SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python311-libsmraw-20230320-1.8.aarch64.rpm"
RPM_HASH = "5cb16a906ba0a7a88d70e5f98afcecf5b2a3fe5c4122974c549a8897752ac4432017264126a05fdbe4d541072e9ee656dda557697792d687c9569c2756bb225a"

RPROVIDES:${PN} += "python3-libsmraw \
python311-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
