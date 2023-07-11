SUMMARY = "Userspace interface for Kernel DRM services for Intel chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for Intel chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_intel1-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "27c9cbe40c61c87ba804726d615433b6efa75543f22ba877fb1e75cce1ac582eb04c9baab667f302d2b8e928361c1d4eb3c9da9b6a4622790dd41dcce36ef439"

RPROVIDES:${PN} += "libdrm-intel.so.1 \
libdrm-intel1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libpciaccess.so.0"

inherit rpm
