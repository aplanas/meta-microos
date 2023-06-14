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

RPM_NAME = "soundtouch-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "c19ec7ba929620dd701df94227d2a88e54c83831f78ad70e30fd835b4518deb9f181e4a97492a13af12b3026817153798dc50b73cb713934945efca983093928"

RPROVIDES:${PN} += "soundtouch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoundTouch.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
