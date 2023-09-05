SUMMARY = "Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libvkd3d1-1.8-1.2.aarch64.rpm"
RPM_HASH = "92d78e1e51a6a721878f9c61bc6c5dd510aa233b908d16094d23eb32d57280df3ee9a5217f9a74ceaeabec2bb5ff0bc5e9ae0532b03e337c38379d043bb03842"

RPROVIDES:${PN} += "libvkd3d.so.1 \
libvkd3d1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvkd3d-shader.so.1"

inherit rpm
