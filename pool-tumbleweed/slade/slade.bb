SUMMARY = "An editor for DOOM maps and WAD/PK3 archives"
DESCRIPTION = "SLADE is an editor for Doom-engine based games and source \
ports. It has the ability to view, modify, and write many different \
game-specific formats, and even convert between some of them, or \
from/to other generic formats such as PNG."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.13"

RPM_NAME = "slade-3.1.13-2.9.aarch64.rpm"
RPM_HASH = "41fb9806c3a7f33948ae0df146e40ab7bd9b71f65c08a2a462a0cee39f58336f3121396147b173222fe1a2eff8544cf4ef41eb58836ff5a28dfce0bb68099605"

RPROVIDES:${PN} += "application() \
application(net.mancubus.SLADE.desktop) \
bundled(dumb) \
metainfo() \
metainfo(net.mancubus.SLADE.metainfo.xml) \
slade \
slade(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLU.so.1()(64bit) \
libGLX.so.0()(64bit) \
libOpenGL.so.0()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libclzma-suse.so.0()(64bit) \
libcurl.so.4()(64bit) \
libfluidsynth.so.3()(64bit) \
libfreeimage.so.3()(64bit) \
libftgl.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libsfml-audio.so.2.5()(64bit) \
libsfml-network.so.2.5()(64bit) \
libsfml-system.so.2.5()(64bit) \
libsfml-window.so.2.5()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu_net-suse.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse.so.3.0.5()(64bit) \
libwx_gtk2u_aui-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_gl-suse.so.3.0.5()(64bit) \
libwx_gtk2u_html-suse.so.3.0.5()(64bit) \
libwx_gtk2u_media-suse.so.3.0.5()(64bit) \
libwx_gtk2u_propgrid-suse.so.3.0.5()(64bit) \
libwx_gtk2u_stc-suse.so.3.0.5()(64bit) \
libz.so.1()(64bit)"

inherit rpm
