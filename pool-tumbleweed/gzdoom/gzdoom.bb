SUMMARY = "A DOOM source port with graphic and modding extensions"
DESCRIPTION = "GZDoom is a port (a modification) of the original Doom source code, featuring: \
* an OpenGL renderer, HQnX/xBRZ rescaling, 3D floor and model support \
* Truecolor software rendering, extending the classic 8-bit palette \
* Heretic, Hexen and Strife game modes and support for a lot of \
  additional IWADs. \
* Boom and Hexen map extension support, scriptability with ACS and \
  ZScript, and various modding features regarding actors and scenery. \
* Demo record/playback of classic and Boom demos is not supported. \
 \
The executables hard-require SSE2 on i686 currently."
LICENSE = "GPL-3.0-only"

PV = "4.10.0"

RPM_NAME = "gzdoom-4.10.0-3.3.aarch64.rpm"
RPM_HASH = "00d4fadc1d2b3c97ccd79daab28cc538686ea6e0117d0a74320730d205ff5dbc2f348791810572d914ab54df2609b87ab0d38cfebb542a165d2e8c9fef6972b6"

RPROVIDES:${PN} += "bundled-gdtoa \
bundled-re2c \
bundled-xbrz \
gzdoom \
qzdoom \
zdoom"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSPIRV.so.13 \
libbz2.so.1 \
libc.so.6 \
libclzma-suse.so.0 \
libdiscord-rpc.so.3.4.0 \
libgcc-s.so.1 \
libglslang.so.13 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvpx.so.8 \
libz.so.1 \
libzmusic.so.1"

inherit rpm
