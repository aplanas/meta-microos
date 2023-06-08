SUMMARY = "DOOM 3 source port"
DESCRIPTION = "dhewm3 is a DOOM 3 GPL source port. \
Unlike the original DOOM 3, dhewm3 uses: \
 \
- SDL for low level OS support, OpenGL and input handling \
- OpenAL for audio output, all OS specific audio backends are gone \
- OpenAL EFX for EAX reverb effects \
- Better support for widescreen (and arbitrary display resolutions)"
LICENSE = "GPL-3.0-only"

PV = "1.5.2"

RPM_NAME = "dhewm3-1.5.2-1.5.aarch64.rpm"
RPM_HASH = "ed4014d393a0a68c86606aaee662faadbe87032214b469a4f15c0e6cdee334e9419f3358bd236c742d645dea78ad4119cf6abec6bae6877f954531ce95bd991f"

RPROVIDES:${PN} += "dhewm3 dhewm3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libz.so.1()(64bit)"

inherit rpm
