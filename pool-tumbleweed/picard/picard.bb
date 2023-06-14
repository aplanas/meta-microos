SUMMARY = "The Next Generation MusicBrainz Tagger"
DESCRIPTION = "MusicBrainz Picard is a MusicBrainz tag editor written in Python. \
Picard Tagger focuses on album-oriented tagging as opposed to \
track-based tagging."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "picard-2.8.5-1.3.aarch64.rpm"
RPM_HASH = "f6118f487977db82b83269f6b92624c8a41dabe49ab32982abede025c1674a3744a1087c75e2acce5e84da90ce1743a620dea845eee03ea524fd8432a640e019"

RPROVIDES:${PN} += "picard \
python3.10dist-picard \
python3dist-picard"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-Markdown \
python3-PyYAML \
python3-dateutil \
python3-fasteners \
python3-mutagen \
python3-qt5"

inherit rpm
