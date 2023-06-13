SUMMARY = "Development headers for the Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "vkd3d-devel-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "a7d08b3bf10b80a7ef1621c96c540c7c6f39d6594e32b37a791ad48407f41ed98b055220699ef2fe5f3140715a6af6efb0825e4ee8501666274e7b207e19f497"

RPROVIDES:${PN} += "pkgconfig(libvkd3d) \
pkgconfig(libvkd3d-shader) \
pkgconfig(libvkd3d-utils) \
vkd3d-devel \
vkd3d-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libvkd3d-shader.so.1()(64bit) \
libvkd3d-shader.so.1(VKD3D_1_0)(64bit) \
libvkd3d-utils1 \
libvkd3d1"

inherit rpm
