SUMMARY = "Gstreamer Plugin for PipeWire"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides the gstreamer plugin."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "gstreamer-plugin-pipewire-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "80d773d013d75a6e66b669f6bbbd8e853e51e8316dc2a82bc50bec4e64286001615d4b366fcbc1985bd2e9804954cadfa737c4dadfcf94c9b491b64c2ea0ea07"

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
