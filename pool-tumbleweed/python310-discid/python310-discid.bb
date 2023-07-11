SUMMARY = "Python binding of Libdiscid"
DESCRIPTION = "Python-discid implements Python bindings for MusicBrainz Libdiscid. \
 \
Libdiscid's main purpose is the calculation of an identifier of audio \
discs (disc id) to use for the MusicBrainz database. \
 \
That identifier is calculated from the TOC of the disc, similar to the \
freeDB CDDB identifier. Libdiscid can calculate MusicBrainz Disc IDs and \
freeDB Disc IDs. \
Additionally the MCN of the disc and ISRCs from the tracks can be extracted. \
 \
This module is a close binding that offloads all relevant data \
storage and calculation to Libdiscid. On the other hand it gives a \
pythonic API and uses objects and exceptions."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "python310-discid-1.2.0-2.1.noarch.rpm"
RPM_HASH = "5d2a96b1937a5357c3794995d6628e837b43c11e5595e0b2262091e81c6d1b4da97a54d211b0c134c4e320773997be917721d961a887645e50fae184836a11d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-discid \
python310-discid \
python3dist-discid"

RDEPENDS:${PN} += "libdiscid0 \
python-abi"

inherit rpm
