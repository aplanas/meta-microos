SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python310-libvsmbr-20210509-5.1.aarch64.rpm"
RPM_HASH = "ea9c856592c038195609b301d007e90ffd69eb9d58426c5e142197d4685e620ba9f365d2b16fd8f86e5904af31a76c91407f376a9a2e1725cea7e1356d6186b9"

RPROVIDES:${PN} += "python310-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
