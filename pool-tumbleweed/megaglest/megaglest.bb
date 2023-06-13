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

RPROVIDES:${PN} += "application() \
application(g3dviewer.desktop) \
application(megaglest.desktop) \
application(megaglest_editor.desktop) \
megaglest \
megaglest(aarch-64)"

RDEPENDS:${PN} += "freefont \
gnu-free-fonts \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libftgl.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libircclient.so.1()(64bit) \
libjpeg.so.8()(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libminiupnpc.so.17()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libvlc.so.5()(64bit) \
libvorbisfile.so.3()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_gl-suse.so.9.0.0()(64bit) \
linux-libertine-fonts \
megaglest-data \
p7zip-full"

inherit rpm
