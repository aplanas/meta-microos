SUMMARY = "Tool for Composing Images"
DESCRIPTION = "Enblend is a tool for compositing images using a Burt & Adelson \
multiresolution spline. This technique tries to make the seams between \
the input images invisible. The basic idea is that image features \
should be blended across a transition zone, proportional in size to the \
spatial frequency of the features. For example, objects like trees and \
window panes have rapid changes in color. By blending these features in \
a narrow zone, you cannot see the seam because the eye already expects \
to see color changes at the edge of these features. Clouds and sky are \
the opposite. These features must be blended across a wide transition \
zone because any sudden change in color is immediately noticeable."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "enblend-enfuse-4.2-6.14.aarch64.rpm"
RPM_HASH = "957692bb26b491f822178bbe4ffda7589dcb8ba5b09d883cf470be48d4cf3bd8b7ce8d7d54c4bdcf3da2dd916ed86409da6000c5b7ecc9a6f0efcb8917726a44"

RPROVIDES:${PN} += "enblend \
enblend-enfuse \
enblend-enfuse(aarch-64) \
enfuse"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libvigraimpex.so.11()(64bit)"

inherit rpm
