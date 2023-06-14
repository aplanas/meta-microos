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

RPROVIDES:${PN} += "scummvm-tools"

RDEPENDS:${PN} += "libFLAC.so.12 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libz.so.1"

inherit rpm
