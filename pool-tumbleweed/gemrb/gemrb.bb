SUMMARY = "Game engine made with pre-rendered background"
DESCRIPTION = "GemRB is an implementation of Bioware's Infinity Engine which was \
written to support pseudo-3D role playing games based on the \
Dungeons & Dragons ruleset. \
 \
You will need the original game files of Baldur's Gate and the Icewind \
Dale series or Planescape: Torment to play."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.1.1"

RPM_NAME = "gemrb-0.9.1.1-2.3.aarch64.rpm"
RPM_HASH = "749f97aa12e6e139b442f46af894c347be4c55c50386d6baf718c0f0588954597e6b80ff0469fad61f1170b622cb05b16574029104f75151996d6d12ceae144a"

RPROVIDES:${PN} += "application() \
application(gemrb.desktop) \
config(gemrb) \
gemrb \
gemrb(aarch-64) \
libgemrb_core.so.0.9.1()(64bit) \
metainfo() \
metainfo(org.gemrb.gemrb.metainfo.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libvlc.so.5()(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
