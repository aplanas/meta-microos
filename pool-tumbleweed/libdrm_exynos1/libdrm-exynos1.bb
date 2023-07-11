SUMMARY = "Userspace interface to kernel DRM services for Samsung Exynos chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Samsung Exynos chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_exynos1-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "cec97926e208ac9cb9fa25f51d294e7ecb89877a18c3efe47b0631deed2fd5f57e669c851b9b40e635457a83044291d8decb19178ccf586434b3a4938660d064"

RPROVIDES:${PN} += "libdrm-exynos.so.1 \
libdrm-exynos1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
