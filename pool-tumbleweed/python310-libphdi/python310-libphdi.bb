SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libphdi-20221025-4.1.aarch64.rpm"
RPM_HASH = "b7fd84a39fddbd7e803d4ace99443958b9174f6321ef34150547b87f0f154b02952cbc42af5d56100801af8c6dc5b2b033a7a916f6d4ddfa0bbb5e8c9fe93247"

RPROVIDES:${PN} += "python310-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
