SUMMARY = "Library to access to optical disc (split) RAW image files"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw1-20210503-3.8.aarch64.rpm"
RPM_HASH = "03f239d3be416f3dc38a2a8086231e7767c85fdb55a3fec60822449965944807c5a005ae83be6eff3b0f272d233cfde5248b0c06cf1be9eeff33a2188ae1b3ca"

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
