SUMMARY = "Gstreamer Plugin for PipeWire"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides the gstreamer plugin."
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "gstreamer-plugin-pipewire-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "0ba94b642550f2de1c968b7194e842665d9ab61fce706f261a2311be39544c2946eaeb1532aa091c32bd25924611bd75aa63a971047ff64f6f811b66f10e895d"

RPROVIDES:${PN} += "gstreamer-plugin-pipewire \
gstreamer1 \
libgstpipewire.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libpipewire-0.3.so.0"

inherit rpm
