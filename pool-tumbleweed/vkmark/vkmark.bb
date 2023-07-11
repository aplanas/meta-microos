SUMMARY = "Vulkan benchmark utility"
DESCRIPTION = "An extensible Vulkan benchmarking suite with targeted, configurable scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2017.08+git.20230412"

RPM_NAME = "vkmark-2017.08+git.20230412-1.1.aarch64.rpm"
RPM_HASH = "e28ccbabee6eee367751bffbe04457fccc4f8fc16a451af8546fa9ed0879694633f80adc296afd260ee1429d6efcf082bda5505875b2ee7affb7e152cc41cea4"

RPROVIDES:${PN} += "vkmark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassimp.so.5 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb-icccm.so.4 \
libxcb.so.1"

inherit rpm
