SUMMARY = "Fast Light User Interface Designer"
DESCRIPTION = "Fast Light User Interface Designer, an interactive GUI designer for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-fluid-1.3.1001-1.6.aarch64.rpm"
RPM_HASH = "57c7ffa36886c8ee6758f690a867fabf28b33cb0fbdd5b781321b04f661846f5d37636949912659e8958f088dbd124ab538f9454d59c322c067342cdf2f30ebf"

RPROVIDES:${PN} += "application() \
application(ntk-fluid.desktop) \
mimehandler(application/x-fluid) \
non-ntk-fluid \
non-ntk-fluid(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libntk.so.1()(64bit) \
libntk_images.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
non-ntk-devel"

inherit rpm
