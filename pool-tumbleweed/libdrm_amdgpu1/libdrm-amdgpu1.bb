SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_amdgpu1-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "5fe12c5e60f357709b963ce11333c684f1aee0a07e90480860a3d04d2989dedceab13ac2742d84eb9aa17017ceb4a9b0a3f0ade19de94873b7405d27f4efa5fb"

RPROVIDES:${PN} += "libdrm-amdgpu.so.1 \
libdrm-amdgpu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
