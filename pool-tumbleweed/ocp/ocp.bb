SUMMARY = "Open Cubic Player for MOD/S3M/XM/IT/MIDI music files"
DESCRIPTION = "Open Cubic Player is a music file player ported from DOS that supports \
Amiga MOD module formats and many variants, such as MTM, STM, 669, \
S3M, XM, and IT.  It is also able to render MIDI files using sound \
patches and play SID, OGG Vorbis, FLAC, and WAV files.  OCP provides a \
nice text-based interface with several text-based and graphical \
visualizations."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.2.105"

RPM_NAME = "ocp-0.2.105-1.1.aarch64.rpm"
RPM_HASH = "bcfcfa1d2a79d1cbec02ea6b155b6ee29c0b86f03a32305722e35846150aa18ab4cb1c37f5838f399bf4fe041423a198ebcde057833aeceb237b8c9a4690caca"

RPROVIDES:${PN} += "bundled-adplug \
bundled-adplugdb \
bundled-libbinio \
bundled-libsidplayfp \
bundled-timidity++ \
libocp.so \
ocp \
opencubicplayer"

RDEPENDS:${PN} += "/bin/sh \
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
