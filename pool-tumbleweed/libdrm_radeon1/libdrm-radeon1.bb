SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_radeon1-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "8ce82dc341654c3b57748c6b36bd17119bf2f2ad9ef162343692682805f629d5290c95b90bc2c7a51b285ce8d792328f56bee9ccc525a25c8168f35cbb1fa4c3"

RPROVIDES:${PN} += "libdrm-radeon.so.1 \
libdrm-radeon1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
