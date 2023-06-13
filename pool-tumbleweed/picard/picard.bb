SUMMARY = "The Next Generation MusicBrainz Tagger"
DESCRIPTION = "MusicBrainz Picard is a MusicBrainz tag editor written in Python. \
Picard Tagger focuses on album-oriented tagging as opposed to \
track-based tagging."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "picard-2.8.5-1.3.aarch64.rpm"
RPM_HASH = "f6118f487977db82b83269f6b92624c8a41dabe49ab32982abede025c1674a3744a1087c75e2acce5e84da90ce1743a620dea845eee03ea524fd8432a640e019"

RPROVIDES:${PN} += "application() \
application(org.musicbrainz.Picard.desktop) \
metainfo() \
metainfo(org.musicbrainz.Picard.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-flac) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/aiff) \
mimehandler(audio/ape) \
mimehandler(audio/dsf) \
mimehandler(audio/flac) \
mimehandler(audio/midi) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpeg4) \
mimehandler(audio/mpg) \
mimehandler(audio/ogg) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-aac) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-flac+ogg) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-midi) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpc) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-ms-wmv) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-oggflac) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-speex+ogg) \
mimehandler(audio/x-tak) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-wma) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-theora) \
mimehandler(video/x-wmv) \
picard \
picard(aarch-64) \
python3.10dist(picard) \
python3dist(picard)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python3-Markdown \
python3-PyYAML \
python3-dateutil \
python3-fasteners \
python3-mutagen \
python3-qt5"

inherit rpm
