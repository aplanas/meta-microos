SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "libgstreamermm-1_0-1-1.10.0-6.9.aarch64.rpm"
RPM_HASH = "c5de3cd306903cc33fd99f9da1cef432bc7512174c6018c77b5c03274c2a2acb1f10002063f462042ec32e11156b704b1e5f7e0ded5115631f61d1253c9a929f"

RPROVIDES:${PN} += "libgstreamermm-1-0-1 \
libgstreamermm-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgstvideo-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
