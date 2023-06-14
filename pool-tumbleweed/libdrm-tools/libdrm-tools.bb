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

RPM_NAME = "libdrm-tools-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "a3aab1717bbb1634d7387af21c7d704f11b9d1346955a1d00626d2ae5ce7bb20e6254bcd02e82c98c5d20a5bb0255f17924af04f3b21438154f0ab621b0f2b58"

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
