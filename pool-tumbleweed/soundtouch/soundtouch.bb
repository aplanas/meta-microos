SUMMARY = "Audio Processing Library"
DESCRIPTION = "SoundTouch is a C++ audio processing library that allows \
changing the sound tempo, pitch and playback rate parameters \
independently from each other. \
 \
* Implements time stretch, pitch shift and sample rate transposing \
  routines. \
* Supports the 16-bit integer or 32-bit floating point \
  PCM mono/stereo formats. \
* Capable of real-time audio stream processing (depending on hardware). \
* Additional use of assembler level and Intel MMX instruction sets."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "soundtouch-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "b83e271bb2a35ccdd4506179d88427acbf617d3e88894e0bb168a6cbb40d9225bef3aa439cc77b04a9f9c5fcdde13fa7a370b2b0b1eb771174cb77d4e88ab4f9"

RPROVIDES:${PN} += "soundtouch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoundTouch.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
