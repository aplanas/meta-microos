SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsgpt is a library to access the GUID Partition Table (GPT) \
volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221029"

RPM_NAME = "libvsgpt1-20221029-4.1.aarch64.rpm"
RPM_HASH = "3e35bcf1e56e8635008ba87cc27c274d3c97aa5d9e6274aa66c68ed5e6973e76f8c44155829f4b885cbd4ebaa6a8c4b79cff9aa7e572f7776996d1c2a8b7b30b"

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
