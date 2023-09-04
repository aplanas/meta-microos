SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python311-libvsmbr-20210509-5.1.aarch64.rpm"
RPM_HASH = "a2bee4f211631e42c02749c9ce66fe44f96bb4221b54ef0427cc724a524ca2f41c3c560be0a0e5b4cc6a69d25fccdbdda0f3979edfe2e8402cc55c1bdf50380a"

RPROVIDES:${PN} += "python3-libvsmbr \
python311-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
