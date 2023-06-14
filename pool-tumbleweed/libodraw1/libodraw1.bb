SUMMARY = "Library to access to optical disc (split) RAW image files"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw1-20210503-3.6.aarch64.rpm"
RPM_HASH = "ad4fe1576ee60d5d55a335cc44182c9d157c39163ad6fcd463b8933693dfe87d8c00b533680c2a8f49efeb3e6ee9bc12e06ea8a3f6d3d17e073f1e5d13fd472f"

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
