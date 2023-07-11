SUMMARY = "Userspace interface to kernel DRM services for Qualcomm Adreno chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Qualcomm Adreno chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_freedreno1-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "62ce46285d0d470481de48564ed681b9c3a762733018ff16c2c7c07aa5ebb75d1285acfe382d1b0e3d09d4041708f7b2b566d2a22b61984315da2c6c15253173"

RPROVIDES:${PN} += "libdrm-freedreno.so.1 \
libdrm-freedreno1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
