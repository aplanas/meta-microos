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

PV = "2.4.115"

RPM_NAME = "libdrm-devel-2.4.115-2.4.aarch64.rpm"
RPM_HASH = "0792b905086a4d49af96b8c1ab19f419eef36b560a3eae064c94d99a0d159b4fef655a25ef63a73981c032c77ff7dab61644c09e388d9ae61bfd615c77d9b68b"

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
