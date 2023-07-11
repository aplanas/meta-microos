SUMMARY = "Open Cubic Player for MOD/S3M/XM/IT/MIDI music files"
DESCRIPTION = "Open Cubic Player is a music file player ported from DOS that supports \
Amiga MOD module formats and many variants, such as MTM, STM, 669, \
S3M, XM, and IT.  It is also able to render MIDI files using sound \
patches and play SID, OGG Vorbis, FLAC, and WAV files.  OCP provides a \
nice text-based interface with several text-based and graphical \
visualizations."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.2.105"

RPM_NAME = "ocp-0.2.105-1.2.aarch64.rpm"
RPM_HASH = "8a466c54014e4f4c5417beca21e0e515bb9b1cf5b4e87942cc03661bc2dc7c2f1fef2bba30e754ec383d4e4e0fec091faad5ae8e8604ce27d29f18873c45c085"

RPROVIDES:${PN} += "bundled-adplug \
bundled-adplugdb \
bundled-libbinio \
bundled-libsidplayfp \
bundled-timidity++ \
libocp.so \
ocp \
opencubicplayer"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-unifont-otf-fonts \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libancient.so.2 \
libasound.so.2 \
libbz2.so.1 \
libc.so.6 \
libcjson.so.1 \
libdiscid.so.0 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmad.so.0 \
libncursesw.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtinfo.so.6 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
