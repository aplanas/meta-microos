SUMMARY = "Game engine made with pre-rendered background"
DESCRIPTION = "GemRB is an implementation of Bioware's Infinity Engine which was \
written to support pseudo-3D role playing games based on the \
Dungeons & Dragons ruleset. \
 \
You will need the original game files of Baldur's Gate and the Icewind \
Dale series or Planescape: Torment to play."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.1.1"

RPM_NAME = "gemrb-0.9.1.1-2.4.aarch64.rpm"
RPM_HASH = "2039343a466925f541c203a6eb6061c33b4267a726236f01aed85cdbaffd76c275dbdc474df3efb2cc34077e9be4a886a63789d96a492f5af9be987ac5381600"

RPROVIDES:${PN} += "config-gemrb \
gemrb \
libgemrb-core.so.0.9.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libpng16.so.16 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libvlc.so.5 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
