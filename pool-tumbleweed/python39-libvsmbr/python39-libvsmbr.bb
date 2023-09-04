SUMMARY = "Library and tools to access the MS-DOS volume system format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "python39-libvsmbr-20210509-5.1.aarch64.rpm"
RPM_HASH = "021cb8122265e6470ca624e70885fac79ec1e8b42c85168218d4086f5190921f153bd85c9a87ba67f15488af9a5fcfa45cf595507baa5475029c8d5f3867ecc5"

RPROVIDES:${PN} += "python39-libvsmbr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libvsmbr.so.1 \
python-abi"

inherit rpm
