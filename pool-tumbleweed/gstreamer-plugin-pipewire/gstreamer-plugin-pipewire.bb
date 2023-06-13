SUMMARY = "Gstreamer Plugin for PipeWire"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides the gstreamer plugin."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "gstreamer-plugin-pipewire-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "fd4324a612a7c85d6d21bae3ce5f16a59f18c481cbdf4b09f3f0b8220dc6c4a3b4cf377e0d0f568e9a9703f0ad3f1db7f5bd9b3ae62b5ed1a6d3d38810e7cf0a"

RPROVIDES:${PN} += "gstreamer-plugin-pipewire \
gstreamer-plugin-pipewire(aarch-64) \
gstreamer1(element-pipewiresink)()(64bit) \
gstreamer1(element-pipewiresrc)()(64bit) \
libgstpipewire.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit)"

inherit rpm
