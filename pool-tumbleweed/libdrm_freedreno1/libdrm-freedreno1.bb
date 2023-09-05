SUMMARY = "Userspace interface to kernel DRM services for Qualcomm Adreno chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Qualcomm Adreno chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_freedreno1-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "16b0ffb4d0ca8d2a123dfe9e99d545d3ab050e65b10a949f44a88096ad05f7687fa65ed7c6733721ab2cb873c829b8497aae19b11bf246f712419f56ed1ba435"

RPROVIDES:${PN} += "libdrm-freedreno.so.1 \
libdrm-freedreno1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
