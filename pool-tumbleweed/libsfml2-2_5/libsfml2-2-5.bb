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

RPROVIDES:${PN} += "libsfml-audio.so.2.5 \
libsfml-graphics.so.2.5 \
libsfml-network.so.2.5 \
libsfml-system.so.2.5 \
libsfml-window.so.2.5 \
libsfml2-2-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libGL.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libopenal.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3"

inherit rpm
