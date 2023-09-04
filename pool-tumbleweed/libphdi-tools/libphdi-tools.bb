SUMMARY = "Utilities for reading Parallels Hard Disk images"
DESCRIPTION = "This subpackage contains the utility programs from libphdi to \
read Parallels Hard Disk images."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libphdi-tools-20221025-4.1.aarch64.rpm"
RPM_HASH = "f325bd8b3d2b0db6d80568370f01da4ec812533c066f2195ece051cfd2d86af93d157bc391930e21d71f18dba7d9e2bbadf1025aa0c06e601df0c789f8eee1f2"

RPROVIDES:${PN} += "libphdi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfguid.so.1 \
libfuse.so.2 \
libphdi.so.1"

inherit rpm
