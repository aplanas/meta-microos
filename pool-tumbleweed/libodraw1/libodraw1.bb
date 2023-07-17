SUMMARY = "Library to access to optical disc (split) RAW image files"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw1-20210503-3.9.aarch64.rpm"
RPM_HASH = "75f1c11d918ac3df7e650fd538818f38e217f050ed6205df5c49e2c50ef73350612c2f49751f2441101785c528855a546d272897f24473a7023521e2709b90f3"

RPROVIDES:${PN} += "libodraw.so.1 \
libodraw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libuna.so.1"

inherit rpm
