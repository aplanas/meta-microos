SUMMARY = "Library for accessing the FAT file system"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat1-20220925-3.11.aarch64.rpm"
RPM_HASH = "baadf9e84203e48103cf80d78a8090269b5eb768f91717ec4b99b436e861581cf3a739077208bcc74ae4685821ebb3c6c4e730c0f488d425f34dcea6723f974d"

RPROVIDES:${PN} += "libfsfat.so.1 \
libfsfat1"

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
libuna.so.1"

inherit rpm
