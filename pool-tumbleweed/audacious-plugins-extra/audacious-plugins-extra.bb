SUMMARY = "Extra plugins for Audacious"
DESCRIPTION = "Extra plugins for the Audacious audio player."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & MIT"

PV = "4.3"

RPM_NAME = "audacious-plugins-extra-4.3-1.6.aarch64.rpm"
RPM_HASH = "719ebed0a822de7a71ca46d5212b202fe42278799364427780f881d554d531835ab53cb7d6cd508086c34b4853e69a3028a6c99df56119c8c20883a4314c1e05"

RPROVIDES:${PN} += "audacious-plugins-extra"

RDEPENDS:${PN} += "audacious-plugins \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libaudcore.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libmp3lame.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm
