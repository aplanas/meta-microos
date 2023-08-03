SUMMARY = "Gstreamer Plugin for PipeWire"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides the gstreamer plugin."
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "gstreamer-plugin-pipewire-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "259449f5c1693e8c5b5f6b23a611a9828535cb7ac188cde154609d5ca56011801540c293930da62a768d6eb30427137fa46a46ea41b7f1a3fb83051af5450f5b"

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
