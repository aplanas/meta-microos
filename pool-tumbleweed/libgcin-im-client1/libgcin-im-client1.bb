SUMMARY = "Share libraries of gcin"
DESCRIPTION = "This package provides runtime libraries for gcin."
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "libgcin-im-client1-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "c45af1de201444d78dd8f0b6f90ad90119df8d0f6b49ebc3084f7749669047e0f7d17a238caccd2a02355832b0908e0017d81503f13acf9ab5db7d6b0d8ebaa7"

RPROVIDES:${PN} += "libgcin-im-client.so.1 \
libgcin-im-client1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
