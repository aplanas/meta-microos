SUMMARY = "Library to provide basic file input/output abstraction"
DESCRIPTION = "libbfio is used in multiple other libraries like libewf, libmsiecf, \
libnk2, libolecf and libpff. It is used to chain I/O to support \
file-in-file access."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libbfio1-20221025-2.7.aarch64.rpm"
RPM_HASH = "584392a02549b63229c0462c4135c94960b20fc0c551191cc35ec10d9fd98928e325edd78c9dc0f4e94c11cdf65b8c5c9c7191862b8643b9ebc1283acdaace87"

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
