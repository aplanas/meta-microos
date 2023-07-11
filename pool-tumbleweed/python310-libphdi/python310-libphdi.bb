SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libphdi-20221025-3.11.aarch64.rpm"
RPM_HASH = "a96ffdc964e981c583cee533afbc0464c629f88cc5213cb552e436c769240ff779fc2db111509c622d5b6ced026f39b422ca8ef728682b278c75e862d69ee291"

RPROVIDES:${PN} += "python310-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
