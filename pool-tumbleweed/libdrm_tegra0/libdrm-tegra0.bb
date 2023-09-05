SUMMARY = "Userspace interface to kernel DRM services for Nvidia Tegra chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Nvidia Tegra chips."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm_tegra0-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "ebbcd3d86046c5ded312a0db13787d03e55881c7a253a34b822858ec52fa23e1397c8c009e398193d0e7b45666b3728fac7e606b906f7c0574ab4c4f4a9b366c"

RPROVIDES:${PN} += "libdrm-tegra.so.0 \
libdrm-tegra0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm
