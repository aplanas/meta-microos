SUMMARY = "Userspace interface for Kernel DRM services for Intel chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for Intel chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_intel1-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "3496d2487611833294dbe44a80c7018c92f095dea6ce28d908ae35e29f224777380925cca4e409a3abcb759fbf423f98c16a75d3a15af9cf4021b62cab9eefcc"

RPROVIDES:${PN} += "libdrm_intel.so.1()(64bit) \
libdrm_intel1 \
libdrm_intel1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm.so.2()(64bit) \
libpciaccess.so.0()(64bit)"

inherit rpm
