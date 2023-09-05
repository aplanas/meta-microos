SUMMARY = "Userspace interface to kernel DRM services for Samsung Exynos chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Samsung Exynos chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_exynos1-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "0bd02ab4bd174a99a2d726bfed97987b5c56d0b097ff6e4a5197aab459046e6914259abfb06cae2fc08d22de5dbf02661466069f2426d716f8f47ec48373a941"

RPROVIDES:${PN} += "libdrm-exynos.so.1 \
libdrm-exynos1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
