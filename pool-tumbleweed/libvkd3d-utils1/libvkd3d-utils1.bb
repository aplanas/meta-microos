SUMMARY = "Direct3D 12 to Vulkan translation library utilities"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation utilities library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "libvkd3d-utils1-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "1c12fb6d71a69869a87472db701fbe45b843047ec9a8d81b757df66f84c0edef7a3efd808296dfec7e291dc4dd06f61065d6b8ee61cdcb452ae248d9630b7bfd"

RPROVIDES:${PN} += "libvkd3d-utils.so.1 \
libvkd3d-utils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvkd3d-shader.so.1 \
libvkd3d.so.1"

inherit rpm
