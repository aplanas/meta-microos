SUMMARY = "Diagnostic utilities for DRI and DRM"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers. \
 \
This package contains diagnostic utilities for DRI and DRM."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm-tools-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "23c73c64ac2b520474408b1e76e80b3ba25bac4d6cd5ed1d0a2f5deb23b9d86100ab11b8004de83e32e4420ee0ee6206d7bd337ba8b11066ab6ffff9286b90e9"

RPROVIDES:${PN} += "libdrm \
libdrm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm-etnaviv.so.1 \
libdrm-exynos.so.1 \
libdrm-tegra.so.0 \
libdrm.so.2"

inherit rpm
