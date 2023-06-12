SUMMARY = "Userspace interface to kernel DRM services for Qualcomm Adreno chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Qualcomm Adreno chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_freedreno1-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "a41062639da4094dd1696de5d221fa4976a84fad727346143e15a657753a943d2efd56ac126ddff53e880419a1ec95948a5f1de1e48cbdd570727649e0581782"

RPROVIDES:${PN} += "libdrm_freedreno.so.1()(64bit) \
libdrm_freedreno1 \
libdrm_freedreno1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm.so.2()(64bit)"

inherit rpm