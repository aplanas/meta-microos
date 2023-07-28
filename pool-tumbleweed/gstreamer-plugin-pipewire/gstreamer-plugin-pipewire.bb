SUMMARY = "Gstreamer Plugin for PipeWire"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides the gstreamer plugin."
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "gstreamer-plugin-pipewire-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "5bc7e138410d9d1b5f3a26b570eed97531a79862bc2de4ab46c2e0e5f997d46c91ecc923cb54f0e79686fc015ec41eedb01b724b2e251e739c9ff927d83984a1"

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
