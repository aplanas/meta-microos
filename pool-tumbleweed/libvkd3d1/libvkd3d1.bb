SUMMARY = "Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libvkd3d1-1.8-1.1.aarch64.rpm"
RPM_HASH = "bb9dd8b04c88bd0d9c77c9a7a0b4d36434619de4bb230aa56254358878febfa1e305c9f816693741481db166d293df05125890fc00b60e4bf22ca24b7089d0a8"

RPROVIDES:${PN} += "libvkd3d.so.1 \
libvkd3d1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvkd3d-shader.so.1"

inherit rpm
