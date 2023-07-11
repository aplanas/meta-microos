SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python311-libvsmbr-20210509-4.9.aarch64.rpm"
RPM_HASH = "39514164eeadcec6c8e5709ae6448f4e8228967ab10e39f768105d6d0c9be16b47d6be849ca560715766b53af517f9cb9bd37144fbe10510ba9f46ab2e9fea63"

RPROVIDES:${PN} += "python3-libvsmbr \
python311-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
