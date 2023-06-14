SUMMARY = "GStreamer 1.0 plugin for python"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugin-python-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "40b259d5e7fe962cf42a6bd2465ada183c57d9ab8af8acdd856a05a9e15b8bcc19caef952d000c36d800a9b81fdaf3507c8ae5a7a434e2bc3f6c5972f649b3db"

RPROVIDES:${PN} += "gstreamer-plugin-python \
libgstpython.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpython3.10.so.1.0"

inherit rpm
