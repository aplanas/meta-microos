SUMMARY = "The Vulkan 3D graphics and compute API"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media."
LICENSE = "Apache-2.0"

PV = "1.3.261.0"

RPM_NAME = "libvulkan1-1.3.261.0-1.1.aarch64.rpm"
RPM_HASH = "9249c79689426b6ce5feaa9690019d52c158b29ee139d87c41b256d264c42e05b22710f895a2a8e09cd89933dce5bfb90522b2b76cf23f4394eed2fbc5e0cb9a"

RPROVIDES:${PN} += "libvulkan.so.1 \
libvulkan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
