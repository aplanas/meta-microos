SUMMARY = "Userspace interface for Kernel DRM services for NVIDIA chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface for Kernel DRM services \
for NVIDIA chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_nouveau2-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "10161428f34cad1b872d01accb848470dab0a61da37a634f6c8ca11a7edd209149be26e3dd7657fd28e41e554a26fa4cae5a0eb9e26f34276455154de88d0336"

RPROVIDES:${PN} += "libdrm-nouveau.so.2 \
libdrm-nouveau2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
