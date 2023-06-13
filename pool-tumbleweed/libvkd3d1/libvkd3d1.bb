SUMMARY = "Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "libvkd3d1-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "adac7720201ac4486b0b64b9d98abf2c2d872ce922363a0e23e17ce96d61fd2747fe5fd43df70da5a2991673651b5b68e289cb28497e2828a521512c90e54b9a"

RPROVIDES:${PN} += "libvkd3d.so.1()(64bit) \
libvkd3d.so.1(VKD3D_1_0)(64bit) \
libvkd3d1 \
libvkd3d1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libvkd3d-shader.so.1()(64bit) \
libvkd3d-shader.so.1(VKD3D_1_0)(64bit)"

inherit rpm
