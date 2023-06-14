SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python39-libmodi-20221023-3.7.aarch64.rpm"
RPM_HASH = "f3c7ad853b41187319ca2ff318b6889761b924fcaf1296cbc0a0120eff4dac9d7894652abb7075502a141e8ef1ccb59ff885b49a4887e8b97d1a0874dea45845"

RPROVIDES:${PN} += "python39-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
