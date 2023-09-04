SUMMARY = "Library for accessing the MS-DOS partition table format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr1-20210509-5.1.aarch64.rpm"
RPM_HASH = "1ccc6512b9ca0a4be01070aab16fa09ac2c2a9aa6663ef6dd69fb1044032dfe293540cfdacc97f0c7e0a04f89ebe446043aa2b4cbe3edd2f2160b9419c0e41bf"

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
