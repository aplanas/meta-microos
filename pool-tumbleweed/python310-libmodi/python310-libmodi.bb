SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python310-libmodi-20221023-3.12.aarch64.rpm"
RPM_HASH = "bd81e8c9a96c0597394cf66a84f6de7ec03725586c2654144d7b735e8d8c084e4dd1d5f8a1b0468532c63cfaa30394865d86664972c5bc22c049f559fbde9578"

RPROVIDES:${PN} += "python310-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
