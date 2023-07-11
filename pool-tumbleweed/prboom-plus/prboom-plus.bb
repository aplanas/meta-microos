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

RPM_NAME = "prboom-plus-2.6.2-3.11.aarch64.rpm"
RPM_HASH = "f6b440820f25042084ecff9101d2611c70ea25515545c42ed5d5567c2ce8e6936042f9f713947d1e4f8ca38d5d54b2a2c5e74ad1c5cd375f9103755c3f273d95"

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
