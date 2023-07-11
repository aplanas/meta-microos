SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python39-libmodi-20221023-3.11.aarch64.rpm"
RPM_HASH = "d38d08d948bff058cea659533fa94461b034afd39402fc7bad8a920d1a093c468edcc4e75b29c27cafdf008c89c572067077bdef4805d5b0c655be185c6d8146"

RPROVIDES:${PN} += "python39-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
