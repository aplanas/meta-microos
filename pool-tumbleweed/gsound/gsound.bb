SUMMARY = "A library for playing system sounds"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "gsound-1.0.3-2.9.aarch64.rpm"
RPM_HASH = "f4cdd93ad2a9d8b12babbf8a2022fb530f36b64d3d175779875df86194552c1cddda49a3390940c9cb97ab6c64fc1bc6388c2edeffbdc1183b40ca780539e8ff"

RPROVIDES:${PN} += "gsound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0"

inherit rpm
