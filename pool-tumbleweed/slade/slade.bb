SUMMARY = "An editor for DOOM maps and WAD/PK3 archives"
DESCRIPTION = "SLADE is an editor for Doom-engine based games and source \
ports. It has the ability to view, modify, and write many different \
game-specific formats, and even convert between some of them, or \
from/to other generic formats such as PNG."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.13"

RPM_NAME = "slade-3.1.13-2.9.aarch64.rpm"
RPM_HASH = "41fb9806c3a7f33948ae0df146e40ab7bd9b71f65c08a2a462a0cee39f58336f3121396147b173222fe1a2eff8544cf4ef41eb58836ff5a28dfce0bb68099605"

RPROVIDES:${PN} += "bundled-dumb \
slade"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libbz2.so.1 \
libc.so.6 \
libclzma-suse.so.0 \
libcurl.so.4 \
libfluidsynth.so.3 \
libfreeimage.so.3 \
libftgl.so.2 \
libgcc-s.so.1 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libsfml-audio.so.2.5 \
libsfml-network.so.2.5 \
libsfml-system.so.2.5 \
libsfml-window.so.2.5 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.3.0.5 \
libwx-baseu-suse.so.3.0.5 \
libwx-gtk2u-adv-suse.so.3.0.5 \
libwx-gtk2u-aui-suse.so.3.0.5 \
libwx-gtk2u-core-suse.so.3.0.5 \
libwx-gtk2u-gl-suse.so.3.0.5 \
libwx-gtk2u-html-suse.so.3.0.5 \
libwx-gtk2u-media-suse.so.3.0.5 \
libwx-gtk2u-propgrid-suse.so.3.0.5 \
libwx-gtk2u-stc-suse.so.3.0.5 \
libz.so.1"

inherit rpm
