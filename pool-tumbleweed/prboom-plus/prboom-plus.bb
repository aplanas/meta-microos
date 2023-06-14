SUMMARY = "DOOM source port with demo compatibility"
DESCRIPTION = "PrBoom+ is a conservative Doom source port. It features: \
 \
* The removal of engine limits and bugs, like the visplane limit, \
  savegame size limit, the tutti-frutti and medusa visual effects, \
  and others. \
* BOOM editing extensions, e.g. configurable animated/switch \
  textures, deep water effect, scrolling walls/floors/ceilings, \
  conveyor belts, translucent walls and sprites, friction effects, \
  and generic linedef actions. \
* Focus on retaining compatibility with the original Doom engines \
  for the purpose of demo recording and playback. \
* High resolution rendering of map geometry, optionally in OpenGL \
  mode."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.2"

RPM_NAME = "prboom-plus-2.6.2-3.10.aarch64.rpm"
RPM_HASH = "9b5e885c4bf781e407577c1b089f4fabb5c1c0dec30bc1d16e038e255fe06562316ebfe1959ec040a9dac642ce342532955fb3fa3b94219bf2f794550a4e8a4e"

RPROVIDES:${PN} += "prboom \
prboom-plus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpcreposix.so.0 \
libportmidi.so.2 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
