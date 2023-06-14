SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_amdgpu1-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "fa14bc14968cf7846335de385e4ad3b06ae4e1d177b8be6f7976e4f10ebe1b8f6a09748ae8261ddfc02e661dd6b732b46f65d820864fbc7a79d4d0bc0e86adcb"

RPROVIDES:${PN} += "libdrm-amdgpu.so.1 \
libdrm-amdgpu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
