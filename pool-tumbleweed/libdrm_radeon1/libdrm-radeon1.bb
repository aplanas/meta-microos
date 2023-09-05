SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_radeon1-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "45423e43dd67a707ac666759c360cdfd5b280fe831bb597841c6c0caa5590eb92b1c326c64f2d00d2d43e9d42156e4d4992ed4a4b44b1c4326519b2e20ee1dfe"

RPROVIDES:${PN} += "libdrm-radeon.so.1 \
libdrm-radeon1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
