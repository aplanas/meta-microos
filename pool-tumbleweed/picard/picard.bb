SUMMARY = "The Next Generation MusicBrainz Tagger"
DESCRIPTION = "MusicBrainz Picard is a MusicBrainz tag editor written in Python. \
Picard Tagger focuses on album-oriented tagging as opposed to \
track-based tagging."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "picard-2.8.5-2.1.aarch64.rpm"
RPM_HASH = "1a69b504b5cb15022515dbb499afd463639e7a38fffd2940cfa36bb60a4987e99cceec78aa14002d2c18ba880cc8afcb02318116d3d89bafa02b9455af5e670a"

RPROVIDES:${PN} += "picard \
python3.11dist-picard \
python3dist-picard"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-Markdown \
python3-PyJWT \
python3-PyQt5 \
python3-PyYAML \
python3-discid \
python3-fasteners \
python3-mutagen \
python3-python-dateutil"

inherit rpm
