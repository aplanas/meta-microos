SUMMARY = "Library That Provides Access to the MusicBrainz Server"
DESCRIPTION = "MusicBrainz is the second generation incarnation of the CD Index. This \
server is designed to enable audio CD, MP3 and Vorbis players to \
download metadata about the music they are playing."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libmusicbrainz-devel-5.1.0-1.9.aarch64.rpm"
RPM_HASH = "858c666be120c5e45002c4e17cc430d36d45fa2741b6cdd3fea3c7474bbe370169279439f3363f0a8bd3a0ac5e49aa537df2d80217b9816768ac1cdae74161ea"

RPROVIDES:${PN} += "libmusicbrainz-devel \
libmusicbrainz5-devel \
pkgconfig-libmusicbrainz5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmusicbrainz5-1 \
libstdc++-devel \
pkgconfig-libxml-2.0 \
pkgconfig-neon"

inherit rpm
