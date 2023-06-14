SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230427"

RPM_NAME = "libfsntfs1-20230427-1.1.aarch64.rpm"
RPM_HASH = "902b2f02b27b8b70d93e82fba5aef38af6d357dca4a479e2dc63717915e80d063447dd87a28f26bc1adbe7071ee09987e93ef0d65f80a78500c8561183d10db9"

RPROVIDES:${PN} += "libfsntfs.so.1 \
libfsntfs1"

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
libfdata.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
