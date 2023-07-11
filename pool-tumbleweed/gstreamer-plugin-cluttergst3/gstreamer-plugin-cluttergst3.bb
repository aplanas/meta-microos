SUMMARY = "GStreamer Clutter Plug-In"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
This plug-in for GStreamer contains elements to render to Clutter \
textures."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "gstreamer-plugin-cluttergst3-3.0.27-2.5.aarch64.rpm"
RPM_HASH = "ec832cc8e91677fab60166838f57a9fc95f96ca0ebe20055bf078363d6fbb758fd2fc04cbd33bf7bf2a28f88350db20c012c419ea79c84c3f9df72361200943d"

RPROVIDES:${PN} += "gstreamer-plugin-cluttergst3 \
libcluttergst3.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
