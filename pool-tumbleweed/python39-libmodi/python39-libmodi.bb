SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python39-libmodi-20221023-4.1.aarch64.rpm"
RPM_HASH = "75c9abc64338ed261937b28edf0825281b67a121fc9a87a8950203dd97b2c2538926ed0f2aac06db4e1ec5ab14c950274dbee43e9fa4ec9e873407a9b30ef4cf"

RPROVIDES:${PN} += "python39-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
