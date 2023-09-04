SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libphdi-20221025-4.1.aarch64.rpm"
RPM_HASH = "69319a477190669db52ef2e34a01d7f92a895dbc948b554b0a60489200de6dbc93f5f5913c05314d0246d5de5062d7d9fb1bbc368ee1bdf304f95a7ba6e8f641"

RPROVIDES:${PN} += "python3-libphdi \
python311-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
