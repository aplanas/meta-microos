SUMMARY = "Direct3D 12 to Vulkan translation library utilities"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation utilities library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libvkd3d-utils1-1.8-1.1.aarch64.rpm"
RPM_HASH = "6efda78afaf10347b57c2cda4c58513bc870f2a5b2b480cab0294080c5b16cbddf54e1ba8f0cd5cec89733cdb4dd5850ffd1146758e232a05106e72a7ca8276b"

RPROVIDES:${PN} += "libvkd3d-utils.so.1 \
libvkd3d-utils1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvkd3d-shader.so.1 \
libvkd3d.so.1"

inherit rpm
