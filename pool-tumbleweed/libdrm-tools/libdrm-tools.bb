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

PV = "2.4.115"

RPM_NAME = "libdrm-tools-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "2b77cda940b119c1797d410c99e551736c938615ba32fa42f4ecbfbe8cbab67f9c438db3f96e7d7accdb6f90f76d0e67a2b8b4f4c48c84eceef6f964427e222f"

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
