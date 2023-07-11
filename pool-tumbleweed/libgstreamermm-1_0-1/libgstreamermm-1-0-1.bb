SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "libgstreamermm-1_0-1-1.10.0-6.10.aarch64.rpm"
RPM_HASH = "b2ba66bd44da987365a0f80b0eb20fdeb3e1d7c3383cbbb8ce50d83f373af3a2847300720b90bee2815425b6e579fc000b3cca699c5aae4c6c9ea8b8ad6117ba"

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
