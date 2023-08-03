SUMMARY = "GStreamer 1.0 plugin for python"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugin-python-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "b4962566c813b978cb436ac5459f437c204871e76b55098df23e117b089fdbfa4c27ba0df2c1cc0c1164f660febecd437c168a4eed16b8b132354f467730db14"

RPROVIDES:${PN} += "gstreamer-plugin-python \
libgstpython.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpython3.11.so.1.0"

inherit rpm
