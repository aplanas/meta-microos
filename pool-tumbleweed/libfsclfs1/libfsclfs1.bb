SUMMARY = "Library for accessing the Common Log File System (CLFS)"
DESCRIPTION = "libfsclfs is a library to access the Common Log File System (CLFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20210417"

RPM_NAME = "libfsclfs1-20210417-3.5.aarch64.rpm"
RPM_HASH = "cc25626acc1057a5f60033718fbcf4ae8b479aff6f85136f32fb532be37807e2e38bf3c0d4cab264d1c2bbe7ae33995d056cdb2f7bc47a5ef36c0d6c914b569e"

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
