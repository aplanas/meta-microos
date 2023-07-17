SUMMARY = "Library to provide basic file input/output abstraction"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libbfio1-20221025-2.8.aarch64.rpm"
RPM_HASH = "ca9d1b418131e98aaf75c36278e5a6210ae6a0321477c33b84ad000aaf1e8c1ac6cfc9b583d3d33a80f494dc420cb359d19aca49e7a39300d0161f39c9ca6783"

RPROVIDES:${PN} += "libbfio.so.1 \
libbfio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcpath.so.1 \
libcthreads.so.1 \
libuna.so.1"

inherit rpm
