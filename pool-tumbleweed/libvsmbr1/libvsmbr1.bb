SUMMARY = "Library for accessing the MS-DOS partition table format"
DESCRIPTION = "libvsmbr is a library to access the MS-DOS volume system. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr1-20210509-4.9.aarch64.rpm"
RPM_HASH = "d108400ee44828218c7f859c17f4d2bc118544f668cad603102b2202bdc3b022b3efd2af8f036934fae33df3b962434f2e1462fd7e43e6a12fa04af95bc30a63"

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
