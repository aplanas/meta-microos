SUMMARY = "Userspace interface for Kernel DRM services for Intel chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for Intel chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_intel1-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "bcedf75ada3eb8597e939a70d3f2bc9ee81422724b20939c517eb9635093986d9a9f9c376d8c010d54aeacd881cc66381974f7f23ad2126c9a71b3705e237277"

RPROVIDES:${PN} += "libdrm-intel.so.1 \
libdrm-intel1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libpciaccess.so.0"

inherit rpm
