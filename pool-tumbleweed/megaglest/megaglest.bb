SUMMARY = "Customizable 3D real-time strategy game"
DESCRIPTION = "MegaGlest takes place in a context that could be compared to that of \
pre-Renaissance Europe with the twist that magic forces exist in the \
environment and can be controlled. \
 \
A game takes place on a map of varying size, such as large plains and \
fields, with terrain features like rivers, mountains, seas, or \
cliffs. Players must establish settlements to gain resources, defend \
against other players, and train units to explore the map and attack \
enemies."
LICENSE = "GPL-3.0-or-later"

PV = "3.13.0"

RPM_NAME = "megaglest-3.13.0-7.8.aarch64.rpm"
RPM_HASH = "85cd6ad6b985735674d061e9237c37067788fd0b172eb6623debb5a6b5b69b591150fb81ee0b38ad86cc3742305dd46038cc76c5f5aa8ccf23f60ef9dfcd9bd7"

RPROVIDES:${PN} += "megaglest"

RDEPENDS:${PN} += "freefont \
gnu-free-fonts \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libcurl.so.4 \
libfontconfig.so.1 \
libfribidi.so.0 \
libftgl.so.2 \
libgcc-s.so.1 \
libircclient.so.1 \
libjpeg.so.8 \
liblua5.1.so.5 \
libm.so.6 \
libminiupnpc.so.17 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libvlc.so.5 \
libvorbisfile.so.3 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-gl-suse.so.9.0.0 \
linux-libertine-fonts \
megaglest-data \
p7zip-full"

inherit rpm
