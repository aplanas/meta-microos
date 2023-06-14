SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libphdi-20221025-3.8.aarch64.rpm"
RPM_HASH = "0a5feda49e6e9eaa8a4b19ee3fa5c82551efec7e021112688575742206540cc251755477bd170e077e048dfa09ae7e2fb8c7bcf8e1b881c6eb0a40cd718c6e5a"

RPROVIDES:${PN} += "python39-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
