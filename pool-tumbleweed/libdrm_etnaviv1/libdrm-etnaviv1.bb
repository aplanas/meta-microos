SUMMARY = "Userspace interface to kernel DRM services for Vivante chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Vivante chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_etnaviv1-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "93abaa0c11fdc8b588e327210ee3a424fbd803ccc28fc596d5b40ff7efa9c2b88619a33e8a863653c536c9e06591b0006649428c331ab6ed0eeec9bf0e594002"

RPROVIDES:${PN} += "libdrm-etnaviv.so.1 \
libdrm-etnaviv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
