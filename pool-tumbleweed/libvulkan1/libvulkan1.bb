SUMMARY = "The Vulkan 3D graphics and compute API"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media."
LICENSE = "Apache-2.0"

PV = "1.3.250.0"

RPM_NAME = "libvulkan1-1.3.250.0-1.1.aarch64.rpm"
RPM_HASH = "9b4ab49a7f36784537e0972f3f4c750e98f99a7812f734c9b868bd610750d23dc799012b461c69ee36e6b0aa515431732be49cb32cfbbadb0cbbb77094d53ce5"

RPROVIDES:${PN} += "libvulkan.so.1 \
libvulkan1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
