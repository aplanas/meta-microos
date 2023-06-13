SUMMARY = "Userspace interface to kernel DRM services for Nvidia Tegra chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Nvidia Tegra chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_tegra0-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "04637bfc258a7dd18e5b788665fe7b62525a1eec8d688b0bc4c7193b55167ca1048ac9927c5cc413d8024a81a606e1da40945c2d6909632058180594cce7f990"

RPROVIDES:${PN} += "libdrm_tegra.so.0()(64bit) \
libdrm_tegra0 \
libdrm_tegra0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm.so.2()(64bit)"

inherit rpm
