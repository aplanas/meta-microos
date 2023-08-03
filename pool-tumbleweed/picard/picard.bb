SUMMARY = "The Next Generation MusicBrainz Tagger"
DESCRIPTION = "MusicBrainz Picard is a MusicBrainz tag editor written in Python. \
Picard Tagger focuses on album-oriented tagging as opposed to \
track-based tagging."
LICENSE = "GPL-2.0-or-later"

PV = "2.9"

RPM_NAME = "picard-2.9-1.1.aarch64.rpm"
RPM_HASH = "f0685da97418bf13d5f69651b526f2de8bd7308b0792b2280fc655508796b3e2a70868dde74d291f4259b355c3aab4bdc2278be3c2f61e952ec92982c79e4876"

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
