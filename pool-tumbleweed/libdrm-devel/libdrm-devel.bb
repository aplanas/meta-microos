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

RPM_NAME = "libdrm-devel-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "cb2dcefd5c22e03bfad2b383028bc55e7fef6e7570610781462e97189695903835be22e82c5d6921a940eca9b2532a4ba4b497499104b3de84e7f2b7e25e80f4"

RPROVIDES:${PN} += "libdrm-devel \
libdrm-devel(aarch-64) \
pkgconfig(libdrm) \
pkgconfig(libdrm_amdgpu) \
pkgconfig(libdrm_etnaviv) \
pkgconfig(libdrm_exynos) \
pkgconfig(libdrm_freedreno) \
pkgconfig(libdrm_intel) \
pkgconfig(libdrm_nouveau) \
pkgconfig(libdrm_radeon) \
pkgconfig(libdrm_tegra) \
pkgconfig(libdrm_vc4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdrm2 \
libdrm_amdgpu1 \
libdrm_etnaviv1 \
libdrm_exynos1 \
libdrm_freedreno1 \
libdrm_intel1 \
libdrm_nouveau2 \
libdrm_radeon1 \
libdrm_tegra0 \
pkgconfig(libdrm) \
pkgconfig(pciaccess)"

inherit rpm
