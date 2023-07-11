SUMMARY = "Share libraries of gcin"
DESCRIPTION = "This package provides runtime libraries for gcin."
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "libgcin-im-client1-2.9.0-4.18.aarch64.rpm"
RPM_HASH = "ee6edd728a00036f599d88b9568d539efcfb7e3a93b88bd0950e1652e346146cae71e59224862b95b63a63976c0d12caec0c0ced1ae1866f0f8e76e3460cc861"

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
