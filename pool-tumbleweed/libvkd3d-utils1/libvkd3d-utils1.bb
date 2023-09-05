SUMMARY = "Direct3D 12 to Vulkan translation library utilities"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation utilities library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libvkd3d-utils1-1.8-1.2.aarch64.rpm"
RPM_HASH = "9c79b4b9da25fc985ef1f0b26c241f966e3ae0b0de72a9283bcd329055a2ceff7d1ece408220824a2151b7b111d19bffeabb0c4083b42d7c15b753f46f78fbc6"

RPROVIDES:${PN} += "libvkd3d-utils.so.1 \
libvkd3d-utils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvkd3d-shader.so.1 \
libvkd3d.so.1"

inherit rpm
