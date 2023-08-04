SUMMARY = "GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the implementation of the GStreamer API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgsttranscoder-1_0-0-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "d55da3b0c3b614e97d80ce053185cc8d59be9c480f08494d2c605791cc6a018dcb3c1001dade867596c55011ba619b97df3035c5ccfbe09b8d6eeffd5dde6341"

RPROVIDES:${PN} += "libgsttranscoder-1-0-0 \
libgsttranscoder-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
