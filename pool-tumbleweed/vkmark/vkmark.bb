SUMMARY = "Vulkan benchmark utility"
DESCRIPTION = "An extensible Vulkan benchmarking suite with targeted, configurable scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2017.08+git.20220909"

RPM_NAME = "vkmark-2017.08+git.20220909-3.1.aarch64.rpm"
RPM_HASH = "610e7524185804472665e110420868daaa9aceae146844f79f2acc4b3d46b41c32cd6420d6171b343e5f1066c0f8e6dbfd1205dc7690c44935c4894820fd470b"

RPROVIDES:${PN} += "vkmark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassimp.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
libwayland-client.so.0 \
libxcb-icccm.so.4 \
libxcb.so.1"

inherit rpm
