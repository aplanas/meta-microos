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

PV = "2.6.0"

RPM_NAME = "sfml2-devel-2.6.0-1.1.aarch64.rpm"
RPM_HASH = "940a5c934dba83f8377339364778866c90ee2c2c0488c675dfe3782083904127bdd42e2e5a0b70d79ed51190cbab8e4fa9dd7afa58d64a2d77aeaac7346676f4"

RPROVIDES:${PN} += "cmake-SFML \
pkgconfig-sfml-all \
pkgconfig-sfml-audio \
pkgconfig-sfml-graphics \
pkgconfig-sfml-network \
pkgconfig-sfml-system \
pkgconfig-sfml-window \
sfml2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsfml2-2-6 \
pkgconfig-flac \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-ogg \
pkgconfig-openal \
pkgconfig-sfml-audio \
pkgconfig-sfml-graphics \
pkgconfig-sfml-network \
pkgconfig-sfml-system \
pkgconfig-sfml-window \
pkgconfig-vorbis \
pkgconfig-vorbisenc \
pkgconfig-vorbisfile"

inherit rpm
