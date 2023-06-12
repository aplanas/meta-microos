SUMMARY = "LV2 plugins for librubberband"
DESCRIPTION = "Package rubberband-lv2 contains the rubberband LV2 plugin."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-lv2-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "bcf6eb1a55bc56f66827328d538f9022dc9e854361d0a73954e6048225f85b52c72a509a29fb1b4e6ea6f1c46df24a7bdfaa7192c12971fce24f05656c685897"

RPROVIDES:${PN} += "rubberband-lv2 \
rubberband-lv2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librubberband2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
