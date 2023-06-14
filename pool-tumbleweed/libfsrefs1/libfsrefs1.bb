SUMMARY = "Library for accessing the Resilient File System (ReFS)"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs1-20210422-3.3.aarch64.rpm"
RPM_HASH = "3949ee3069285e7fc7115e23db5168975dacfe71361cb5e4919b56521db5f6f0a4444b987689d8e39560b0edca65f094ac75114152a656b5db355d5aaeab99b3"

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
