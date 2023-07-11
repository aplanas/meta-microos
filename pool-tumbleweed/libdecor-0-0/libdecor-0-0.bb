SUMMARY = "Library for client-side Wayland decorations"
DESCRIPTION = "A client-side decorations library for Wayland client."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdecor-0-0-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "246fd1f12d98b2a2998fd550f5f9c82c7a86392011367b3647d66e44d492e13640720b7414f21350cc4a874d7ac04475713ec3011d33e7f5bba396de3461c4ee"

RPROVIDES:${PN} += "libdecor-0-0 \
libdecor-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdecor \
libwayland-client.so.0"

inherit rpm
