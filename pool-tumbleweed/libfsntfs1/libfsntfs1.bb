SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libfsntfs is a library to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "libfsntfs1-20230606-1.4.aarch64.rpm"
RPM_HASH = "1c80dd1fce9ef194990f89b45b282ffd09ba27d9c1e4650228bbf41c2963e3fea1bac6e5cbdc9217b78a4f7b61ffe6e3ff521add3f0fa27b8fc3360cdadf4b45"

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
