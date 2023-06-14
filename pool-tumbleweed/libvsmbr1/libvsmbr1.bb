SUMMARY = "Library for accessing the MS-DOS partition table format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr1-20210509-4.7.aarch64.rpm"
RPM_HASH = "187d5669025a22dfb8f0e2014231d6a7bfeec5343a3f7ca55f26a705400619dad611e092de96b2d0f1b7a54464dfe86d69764101edd1f41fab5188da5968f34b"

RPROVIDES:${PN} += "libvsmbr.so.1 \
libvsmbr1"

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
