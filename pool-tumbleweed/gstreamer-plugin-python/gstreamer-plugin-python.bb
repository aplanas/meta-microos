SUMMARY = "GStreamer 1.0 plugin for python"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugin-python-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "4f3c0e54c3c6d0151a9cea0b252af9b32f593644a72aebb28a53d5be312d7c43176acb7a61b81577b66150b7fddf4fcb473bf834e5b33a745bbc52e31f2b955b"

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
