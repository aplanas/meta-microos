SUMMARY = "Shared library for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library. \
 \
This package provides the shared library for gsound."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "libgsound0-1.0.3-2.9.aarch64.rpm"
RPM_HASH = "ce84c5c9347268889d8ed4576090ddc2d1fedad44675979d2f6cde41823111d18108c95b16759b718f36f29c996a359b5c36886bebb211196c815d1110984c12"

RPROVIDES:${PN} += "libgsound.so.0 \
libgsound0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
