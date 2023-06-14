SUMMARY = "Library for accessing the Common Log File System (CLFS)"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs1-20210417-3.3.aarch64.rpm"
RPM_HASH = "a231a1bfbe171040a6d21c8db4112fb05a53fa1588c35b408285ca913a811ca1e7ed8034430c3fc42a1512d9928fadcc89d02fef53421d5c147eb46e2a11e5ab"

RPROVIDES:${PN} += "libfsclfs.so.1 \
libfsclfs1"

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
