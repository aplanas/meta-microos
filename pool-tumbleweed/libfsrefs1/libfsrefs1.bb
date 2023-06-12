SUMMARY = "Library for accessing the Resilient File System (ReFS)"
DESCRIPTION = "libfsrefs is a library to access the Resilient File System (ReFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210422"

RPM_NAME = "libfsrefs1-20210422-3.3.aarch64.rpm"
RPM_HASH = "3949ee3069285e7fc7115e23db5168975dacfe71361cb5e4919b56521db5f6f0a4444b987689d8e39560b0edca65f094ac75114152a656b5db355d5aaeab99b3"

RPROVIDES:${PN} += "libfsrefs.so.1()(64bit) \
libfsrefs.so.1(V_20210422)(64bit) \
libfsrefs1 \
libfsrefs1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
