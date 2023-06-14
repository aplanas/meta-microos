SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt1-20221029-3.7.aarch64.rpm"
RPM_HASH = "854a1221d1d8efc91ab7428dd48a3999ed80da1281bc080a614d6580418bfdbff27d81d02dfb5103d9d3064eb585c6f872642c1027bee79d244910245a0f98eb"

RPROVIDES:${PN} += "libvsgpt.so.1 \
libvsgpt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1"

inherit rpm
