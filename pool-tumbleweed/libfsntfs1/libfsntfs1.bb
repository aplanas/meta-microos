SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs1-20230606-1.5.aarch64.rpm"
RPM_HASH = "dd94459b87317a80c08e51195e7d07a931cb02e9aa18859fb2fddb0c2f8bcabc49f4f66952cd69bedd29bde9ee1899bb2ef467dee593b86753dc03cfb5b67e15"

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
