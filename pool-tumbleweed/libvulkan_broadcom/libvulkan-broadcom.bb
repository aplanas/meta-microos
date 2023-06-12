SUMMARY = "Mesa vulkan driver for Broadcom"
DESCRIPTION = "This package contains the Vulkan parts for Mesa."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvulkan_broadcom-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "1839aaf05d5346b55b5c35d27aa9c5373eff868e777d7cd58bf2a5264ac4265154a2091c39c84e0ca7b19f0de5e167fd4c2758bcf202b4ab7b2651809d51b1dd"

RPROVIDES:${PN} += "libvulkan_broadcom \
libvulkan_broadcom(aarch-64) \
libvulkan_broadcom.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-dri3.so.0()(64bit) \
libxcb-present.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-sync.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxshmfence.so.1()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
