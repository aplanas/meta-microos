SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libphdi-20221025-3.11.aarch64.rpm"
RPM_HASH = "aabfc72f4a67f25bb9de902674e4a377760180c90d122a8ad60240defbf38bc4de5d1a16638f0c1894d482bd0a245b67f65d2b3b579873fc12d185007de0d10a"

RPROVIDES:${PN} += "python3-libphdi \
python311-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
