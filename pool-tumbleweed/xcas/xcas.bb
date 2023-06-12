SUMMARY = "Computer algebra interface"
DESCRIPTION = "Xcas is an interface to perform computer algebra, function graphs, \
interactive geometry (2-d and 3-d), spreadsheet and statistics \
programmation. It may be used as a replacement for graphic calculators \
for example on netbooks."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0.27"

RPM_NAME = "xcas-1.9.0.27-4.5.aarch64.rpm"
RPM_HASH = "ad2ea1b0ff5cd9c3c9dd7671ef56796c46e19456881ac25ff198bbd2c1a7dc5fd4d6f2851807039b161496a38692ffc9e179fb2bcb1d889dab6df09a1561a5a3"

RPROVIDES:${PN} += "application() \
application(xcas.desktop) \
metainfo() \
metainfo(xcas.metainfo.xml) \
mimehandler(application/x-xcas) \
xcas \
xcas(aarch-64)"
RDEPENDS:${PN} += "giac \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfltk.so.1.3()(64bit) \
libfltk_gl.so.1.3()(64bit) \
libfltk_images.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgiac.so.0()(64bit) \
libgmp.so.10()(64bit) \
libgsl.so.27()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm
