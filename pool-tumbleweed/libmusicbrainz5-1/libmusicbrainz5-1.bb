SUMMARY = "Library That Provides Access to the MusicBrainz Server"
DESCRIPTION = "MusicBrainz is the second generation incarnation of the CD Index. This \
server is designed to enable audio CD, MP3 and Vorbis players to \
download metadata about the music they are playing."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libmusicbrainz5-1-5.1.0-1.9.aarch64.rpm"
RPM_HASH = "3ca68eb3cb1d6b77484666b2e013d94db5f4f0cd4c1d388a4f4165f6dddd4f2f076a997c48cb7b4170dafba00ced2ff5c17f2fb707a64a9f64154ec60c2de067"

RPROVIDES:${PN} += "libmusicbrainz5-1 \
libmusicbrainz5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libneon.so.27 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
