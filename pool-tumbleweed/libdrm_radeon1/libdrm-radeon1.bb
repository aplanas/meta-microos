SUMMARY = "Userspace interface for Kernel DRM services for AMD Radeon chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for AMD Radeon chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_radeon1-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "ec452bffc74a6e2ce7163ad087b92a81df0f1d1f62a7cda14530a4c19e6178eff164e96be0ca0602fc965d204a145e78cf95f1390f2a48bc9c27dcb84cce3bbb"

RPROVIDES:${PN} += "libdrm-radeon.so.1 \
libdrm-radeon1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
