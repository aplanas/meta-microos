SUMMARY = "Development headers for the Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "vkd3d-devel-1.8-1.2.aarch64.rpm"
RPM_HASH = "2190d91a17ca032d2747991c6071dfb67c8322115d60f2f904c7b787d56661ae6d9615e0993779efc34be376ca845c6e9533b326a20cd5302298944b111f0da8"

RPROVIDES:${PN} += "pkgconfig-libvkd3d \
pkgconfig-libvkd3d-shader \
pkgconfig-libvkd3d-utils \
vkd3d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6 \
libvkd3d-shader.so.1 \
libvkd3d-utils1 \
libvkd3d1"

inherit rpm
