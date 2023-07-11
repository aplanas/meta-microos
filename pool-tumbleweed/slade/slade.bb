SUMMARY = "An editor for DOOM maps and WAD/PK3 archives"
DESCRIPTION = "SLADE is an editor for Doom-engine based games and source \
ports. It has the ability to view, modify, and write many different \
game-specific formats, and even convert between some of them, or \
from/to other generic formats such as PNG."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.13"

RPM_NAME = "slade-3.1.13-2.11.aarch64.rpm"
RPM_HASH = "1a76b9ba8dc412c6a31479e42dd63d7d1c3b3f72a4e5b0976f9f67689e354ee071e6c8b60f9cf28ec67d2c50a5f849558d17569a649dcb3f781b5705a17e076c"

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
libsfml-audio.so.2.6 \
libsfml-network.so.2.6 \
libsfml-system.so.2.6 \
libsfml-window.so.2.6 \
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
