SUMMARY = "Userspace interface for Kernel DRM services for NVIDIA chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for NVIDIA chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_nouveau2-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "fc9f7c36de6198d46bba07c37a69e8729192fe8af2cf47dc67e5741f254f434589d44739ecf51ed6e7088a71c19e860f7b3f7c87c9c277e16f1d418ba5b72eb4"

RPROVIDES:${PN} += "libdrm-nouveau.so.2 \
libdrm-nouveau2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
