SUMMARY = "Sound Sample Library for SDL (Simple DirectMedia Layer)"
DESCRIPTION = "SDL_sound is a library that handles the decoding of several popular \
sound file formats, such as wav, ogg mp3 and midi. SDL_sound can just \
play a file or alternatively decode a file and hand back a single \
pointer to the waveform. SDL_sound also can handle channel conversion \
on-the-fly and behind-the-scenes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libSDL_sound-1_0-1-1.0.3-96.6.aarch64.rpm"
RPM_HASH = "e3214940ba6064805c559ef0656d663fb5f123684dd3d2d7676c3b00617cb8753b6757789665c5529ec4bac08f75e10ecb8f9a236495ed65f214b09bdfce4854"

RPROVIDES:${PN} += "SDL_sound \
libSDL_sound-1.0.so.1()(64bit) \
libSDL_sound-1_0-1 \
libSDL_sound-1_0-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmikmod.so.3()(64bit) \
libmodplug.so.1()(64bit) \
libogg.so.0()(64bit) \
libspeex.so.1()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
