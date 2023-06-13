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

RPROVIDES:${PN} += "application() \
application(prboom-plus.desktop) \
mimehandler(application/x-doom-wad) \
prboom \
prboom-plus \
prboom-plus(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_net-2.0.so.0()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libfluidsynth.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcreposix.so.0()(64bit) \
libportmidi.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
