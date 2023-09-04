SUMMARY = "Library for accessing the GUID partition table format"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230506"

RPM_NAME = "libvsapm1-20230506-1.1.aarch64.rpm"
RPM_HASH = "f4079b22accddf82117dfd39761eb6afd510adc68294a7b3ea2d65bfdc3e362625a83c1d6292467c2ca4a9fce59a5fafeb68ad62aa7c09449c190202772132bf"

RPROVIDES:${PN} += "libvsapm.so.1 \
libvsapm1"

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
