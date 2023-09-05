SUMMARY = "Userspace interface to kernel DRM services for Vivante chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Vivante chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_etnaviv1-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "e154ebccafeffaedae97aefefd6e6544f3ee8e427dd3bd28520b94d2c54909d85ed23f26ae73c56cc2d51e175e357bcdc4dcba5a287f969974ec5c235ff065c8"

RPROVIDES:${PN} += "libdrm-etnaviv.so.1 \
libdrm-etnaviv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
