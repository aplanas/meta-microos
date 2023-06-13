SUMMARY = "SFML development files"
DESCRIPTION = "SFML is a C++ multimedia API that provides a low and high-level \
access to graphics, input, audio, etc., and may be seen as an \
object-oriented alternative to SDL. SFML can be used as a minimal \
windowing system to interface with OpenGL, or as a multimedia library \
for building games or interactive programs. \
 \
This subpackage provides the header files needed to build SFML \
programs."
LICENSE = "Zlib"

PV = "2.5.1"

RPM_NAME = "sfml2-devel-2.5.1-1.20.aarch64.rpm"
RPM_HASH = "59cee5e235d5eec9846868be593400deb42818472b6a277e3810b3bde76116555249432aa3cd4ebbb4523adfbe361d4f6436dfd4cbd1055bc4ed80f651993609"

RPROVIDES:${PN} += "cmake(SFML) \
pkgconfig(sfml-all) \
pkgconfig(sfml-audio) \
pkgconfig(sfml-graphics) \
pkgconfig(sfml-network) \
pkgconfig(sfml-system) \
pkgconfig(sfml-window) \
sfml2-devel \
sfml2-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsfml2-2_5 \
pkgconfig(flac) \
pkgconfig(freetype2) \
pkgconfig(gl) \
pkgconfig(ogg) \
pkgconfig(openal) \
pkgconfig(sfml-audio) \
pkgconfig(sfml-graphics) \
pkgconfig(sfml-network) \
pkgconfig(sfml-system) \
pkgconfig(sfml-window) \
pkgconfig(vorbis) \
pkgconfig(vorbisenc) \
pkgconfig(vorbisfile)"

inherit rpm
