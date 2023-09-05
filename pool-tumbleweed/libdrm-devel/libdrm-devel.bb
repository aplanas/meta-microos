SUMMARY = "Libraries, includes and more to develop libdrm applications"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems that support the ioctl \
interface, and for chipsets with DRM memory manager, support for \
tracking relocations and buffers. libdrm is a low-level library, \
typically used by graphics drivers such as the Mesa DRI and X \
drivers. \
 \
This package contains the development headers for the library found \
in libdrm2."
LICENSE = "MIT"

PV = "2.4.116"

RPM_NAME = "libdrm-devel-2.4.116-1.1.aarch64.rpm"
RPM_HASH = "2e45c8a582ba2085e9023c45e8e6f124c766f93bb745d21cc26225b9e042dc0e43cb67443d24d3acaa5709d30e93a812125c736abafc651f251297e9b10b12af"

RPROVIDES:${PN} += "libdrm-devel \
pkgconfig-libdrm \
pkgconfig-libdrm-amdgpu \
pkgconfig-libdrm-etnaviv \
pkgconfig-libdrm-exynos \
pkgconfig-libdrm-freedreno \
pkgconfig-libdrm-intel \
pkgconfig-libdrm-nouveau \
pkgconfig-libdrm-radeon \
pkgconfig-libdrm-tegra \
pkgconfig-libdrm-vc4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdrm-amdgpu1 \
libdrm-etnaviv1 \
libdrm-exynos1 \
libdrm-freedreno1 \
libdrm-intel1 \
libdrm-nouveau2 \
libdrm-radeon1 \
libdrm-tegra0 \
libdrm2 \
pkgconfig-libdrm \
pkgconfig-pciaccess"

inherit rpm
