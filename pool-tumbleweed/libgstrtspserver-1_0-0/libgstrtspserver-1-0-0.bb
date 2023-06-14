SUMMARY = "GStreamer-based RTSP server library"
DESCRIPTION = "Library on top of GStreamer for building an RTSP server - Library files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.3"

RPM_NAME = "libgstrtspserver-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "fccee9155e815f98a230f9b9ed9dcd81ee62422f7a5675048cd2af100befbd7baaade7413fada4d308403dcd3a7c0df0cb42f36b996212ca38d888cb67eb38c2"

RPROVIDES:${PN} += "libgstrtspserver-1-0-0 \
libgstrtspserver-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstsdp-1.0.so.0"

inherit rpm
