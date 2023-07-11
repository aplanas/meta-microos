SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python39-libvsmbr-20210509-4.9.aarch64.rpm"
RPM_HASH = "eb3a563e7bd8bde47828ae91dd283d11a489534b31b55c5de3015ec8dd4d64d4cc624afbbc3ee654ae99fdb00d67becfa3bb84b0a3e22cc076197f2d2954f330"

RPROVIDES:${PN} += "python39-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
