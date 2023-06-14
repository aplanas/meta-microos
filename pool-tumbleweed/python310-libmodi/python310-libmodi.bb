SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python310-libmodi-20221023-3.7.aarch64.rpm"
RPM_HASH = "f8fad1567736854d93ab8b0ee4383fbd2541c78bc4ea6e096969e8247a3c04643843c9482b7cf73d50a3ea4cd2c4be70c63194d58d3582bca86206068af23856"

RPROVIDES:${PN} += "python3-libmodi \
python310-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
