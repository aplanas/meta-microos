SUMMARY = "Library for accessing Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Supported formats include: \
 \
* Sparse bundle disk image \
* Sparse disk image \
* Universal Disk Image Format (UDIF) image \
  * uncompressed \
  * ADC compressed \
  * bzip2 compressed \
  * LZMA compressed \
  * zlib/DEFLATE compressed"
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi1-20221023-4.1.aarch64.rpm"
RPM_HASH = "39307fa1396c68599c00ca694ee9131d16c02506ffda10de13b2f82bd473e598ec54d5423206196468b796b8745e9d276a63adb9ff54d47893300becdd78d3d0"

RPROVIDES:${PN} += "libmodi.so.1 \
libmodi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libbz2.so.1 \
libc.so.6 \
libcdata.so.1 \
libcdirectory.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfmos.so.1 \
libfplist.so.1 \
libfvalue.so.1 \
liblzma.so.5 \
libuna.so.1 \
libz.so.1"

inherit rpm
