SUMMARY = "Userspace interface to kernel DRM services for Samsung Exynos chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Samsung Exynos chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_exynos1-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "075a095484e22bc76e2c4278d9ef9905339e46b649b3b2aacfdc969c44d25dd7d572f6cad916be3c3460677b6df4fe9532ffdf32fdf1e626aa87955e9210e5fb"

RPROVIDES:${PN} += "libdrm_exynos.so.1()(64bit) \
libdrm_exynos1 \
libdrm_exynos1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm.so.2()(64bit)"

inherit rpm
