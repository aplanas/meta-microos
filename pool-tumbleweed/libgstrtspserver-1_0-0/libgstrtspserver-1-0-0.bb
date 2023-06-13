SUMMARY = "GStreamer-based RTSP server library"
DESCRIPTION = "Library on top of GStreamer for building an RTSP server - Library files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.3"

RPM_NAME = "libgstrtspserver-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "fccee9155e815f98a230f9b9ed9dcd81ee62422f7a5675048cd2af100befbd7baaade7413fada4d308403dcd3a7c0df0cb42f36b996212ca38d888cb67eb38c2"

RPROVIDES:${PN} += "libgstrtspserver-1.0.so.0()(64bit) \
libgstrtspserver-1_0-0 \
libgstrtspserver-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstnet-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstrtp-1.0.so.0()(64bit) \
libgstrtsp-1.0.so.0()(64bit) \
libgstsdp-1.0.so.0()(64bit)"

inherit rpm
