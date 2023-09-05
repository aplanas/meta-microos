SUMMARY = "Library for accessing the FAT file system"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "libfsfat1-20220925-4.2.aarch64.rpm"
RPM_HASH = "bf50c2a0dab75e5532a4fd8bf371f41deef3765c3c85db373ff0f2cde86ab703963c9db3bba91a4da40e963c527e68c93e98fcafe7699859ca2b6c4118248d8a"

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
