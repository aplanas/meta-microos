SUMMARY = "Vulkan benchmark utility"
DESCRIPTION = "An extensible Vulkan benchmarking suite with targeted, configurable scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "2017.08+git.20220909"

RPM_NAME = "vkmark-2017.08+git.20220909-3.1.aarch64.rpm"
RPM_HASH = "610e7524185804472665e110420868daaa9aceae146844f79f2acc4b3d46b41c32cd6420d6171b343e5f1066c0f8e6dbfd1205dc7690c44935c4894820fd470b"

RPROVIDES:${PN} += "vkmark \
vkmark(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libassimp.so.5()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvulkan.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm