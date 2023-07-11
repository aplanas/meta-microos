SUMMARY = "Library for accessing the Resilient File System (ReFS)"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs1-20210422-3.5.aarch64.rpm"
RPM_HASH = "176a83e0db3918b7d8ab6bf3a21b09ed80ee690397ec0ddb5b9a68d49d4aa73aaa0ce0c8c8f46020a86e1e95bed50f4ea06c107a0e8561ab4555db2e0e79e9b2"

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
