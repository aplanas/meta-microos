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

RPM_NAME = "scummvm-tools-2.7.0-1.5.aarch64.rpm"
RPM_HASH = "4c04feda91b150016b052069b35886c7e78fd412fb3975cd3a7019a1d90c55e5906923d03712b883e9e1858054a7be7ddab94b034e9c1b6c6ae12e13e382284e"

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
