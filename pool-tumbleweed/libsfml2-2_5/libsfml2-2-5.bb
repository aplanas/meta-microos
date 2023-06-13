SUMMARY = "Free multimedia C++ API"
DESCRIPTION = "SFML is a multimedia API that provides access to graphics, input, \
audio, etc., and may be seen as an object-oriented alternative to \
SDL. It can be used as a minimal windowing system to interface with \
OpenGL, or as a multimedia library for building games and interactive \
programs."
LICENSE = "Zlib"

PV = "2.5.1"

RPM_NAME = "libsfml2-2_5-2.5.1-1.20.aarch64.rpm"
RPM_HASH = "3205158e87598bd3ccac8b3f636a044fbf6b0a932493f2af19811c88569662fb76beefc8a18d99bd2310424067433f3c05fa997863613fe9e336696f52a1c2ce"

RPROVIDES:${PN} += "libsfml-audio.so.2.5()(64bit) \
libsfml-graphics.so.2.5()(64bit) \
libsfml-network.so.2.5()(64bit) \
libsfml-system.so.2.5()(64bit) \
libsfml-window.so.2.5()(64bit) \
libsfml2-2_5 \
libsfml2-2_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libogg.so.0()(64bit) \
libopenal.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
