SUMMARY = "Library to provide basic file input/output abstraction"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libbfio1-20221025-2.5.aarch64.rpm"
RPM_HASH = "e90ffb3762f6eb507a6ee7e8b7c5055c8865b9a330559a7bd0be715c9cd1ca516380a60554dabd4a8b2ad7febf6d1ade2db36d250e545db6ccecd7bdff0030db"

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
