SUMMARY = "Interpreter for several adventure games"
DESCRIPTION = "ScummVM is an interpreter that will play graphic adventure games written for \
LucasArts' SCUMM virtual machine (such as Day of the Tentacle and \
Monkey Island), Sierra's AGI adventures (such as early King's Quest and \
Space Quest games), Adventure Soft's Simon the Sorcerer 1, 2 and Feeble Files, \
Revolution Software's Beneath a Steel Sky and Broken Sword 1, 2 and 2.5, \
Interactive Binary Illusions' Flight of the Amazon Queen, \
Coktel Vision's Gobliiins, Wyrmkeep's Inherit the Earth, Westwood's \
Legend of Kyrandia, and various others."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "scummvm-2.7.0-2.3.aarch64.rpm"
RPM_HASH = "226febd7409ad93653420c2eda1ce820d745ad3726724a66782018d4c6853fa721e1e3f29ecb5164f73345b8e06d2c13e349202c74bc25d4557451201166d7ec"

RPROVIDES:${PN} += "scummvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL2-2.0.so.0 \
libSDL2-net-2.0.so.0 \
liba52.so.0 \
libasound.so.2 \
libc.so.6 \
libcurl.so.4 \
libdiscord-rpc.so.3.4.0 \
libfluidsynth.so.3 \
libfreetype.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgif.so.7 \
libieee1284.so.3 \
libjpeg.so.8 \
libm.so.6 \
libmad.so.0 \
libmpeg2.so.0 \
libogg.so.0 \
libpng16.so.16 \
libspeechd.so.2 \
libstdc++.so.6 \
libtheoradec.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
