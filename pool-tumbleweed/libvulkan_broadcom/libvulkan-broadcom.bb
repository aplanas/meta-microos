SUMMARY = "Mesa vulkan driver for Broadcom"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvulkan_broadcom-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "85af90aa1e3e3238f6d16ea5db71627e83e02cca56454d70fade11866822318949056cd1a412e4f9e8f5c06a03c28260068c620107f36efd37c5dc24ad1de483"

RPROVIDES:${PN} += "libvulkan-broadcom \
libvulkan-broadcom.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libc.so.6 \
libdrm.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxshmfence.so.1 \
libz.so.1"

inherit rpm
