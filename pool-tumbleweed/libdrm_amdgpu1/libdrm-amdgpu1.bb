SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_amdgpu1-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "b5e100addb8d4e4ada7c8a3d679dd4879a3d16d8fbcf1363dcaccaecbbbd6624f8baf0a6769e2125f4ab4ea3fd3f58f5aea6defea9a2f9cbd9695e767d5721fd"

RPROVIDES:${PN} += "libdrm-amdgpu.so.1 \
libdrm-amdgpu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
