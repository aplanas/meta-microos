SUMMARY = "ScummVM-related tools"
DESCRIPTION = "This is a collection of various tools that may be useful to use in \
conjunction with ScummVM. \
Please note that although a tool may support a feature, certain ScummVM \
versions may not. ScummVM 0.6.x does not support FLAC audio, for example. \
 \
Many games package together all their game data in a few big archive files. \
The following tools can be used to extract these archives, and in some cases \
are needed to make certain game versions usable with ScummVM. \
 \
The following tools can also be used to analyze the game scripts \
(controlling the behavior of certain scenes and actors in a game). \
These tools are most useful to developers."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "scummvm-tools-2.7.0-1.4.aarch64.rpm"
RPM_HASH = "a8cb22c5206ecd5db82691224bbe690671a66ff2aef1f6fe6bf4685d9b2bf4f77c41f45c5c9ac2a8e11fcf80f705371545e7870571143335792c2d2ad3319700"

RPROVIDES:${PN} += "application() \
application(scummvm-tools.desktop) \
scummvm-tools \
scummvm-tools(aarch-64)"

RDEPENDS:${PN} += "libFLAC.so.12()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libogg.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
