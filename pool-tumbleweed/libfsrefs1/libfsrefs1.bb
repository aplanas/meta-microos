SUMMARY = "Library for accessing the Resilient File System (ReFS)"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs1-20210422-3.6.aarch64.rpm"
RPM_HASH = "18d64a913f3426d2a7591979dd8aa7b42ca574b1348ac9fbcf1705da405cf79f36a2b8d2d5fc72b3109ff1ba89522c6fe26e4c260071a27f0bf4484d4624ad22"

RPROVIDES:${PN} += "libfsrefs.so.1 \
libfsrefs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
