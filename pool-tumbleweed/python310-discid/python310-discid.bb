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

RPM_NAME = "python310-discid-1.2.0-1.15.noarch.rpm"
RPM_HASH = "c3c2211283e876fe1c584635002ca9a262ac3e43b8d55971459895c9f2089e7f7845eaa0f4e2dd338d6f71aa4f0e762fd44452f224239adfef25c47719a3c549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-discid \
python3.10dist(discid) \
python310-discid \
python3dist(discid)"

RDEPENDS:${PN} += "libdiscid0 \
python(abi)"

inherit rpm
