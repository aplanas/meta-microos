SUMMARY = "The Next Generation MusicBrainz Tagger"
DESCRIPTION = "MusicBrainz Picard is a MusicBrainz tag editor written in Python. \
Picard Tagger focuses on album-oriented tagging as opposed to \
track-based tagging."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.1"

RPM_NAME = "picard-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "669301641de4a3c44de9bc488de01809f731740c5bdf8153cdf2119bbe3b890297755d40e7f707d039902bbed21f3461baccfa3fe2031bff7e0cb5684807b8bb"

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
