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

RPM_NAME = "python311-discid-1.2.0-1.15.noarch.rpm"
RPM_HASH = "28a26c403fbc1cfede395aed2b4c439adbd22453b8175fb8aa35e1aaeae64d0b672164eddb7db851f482d2aac42dce1b4b145095d4ae327212333390e0e75abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(discid) \
python311-discid \
python3dist(discid)"

RDEPENDS:${PN} += "libdiscid0 \
python(abi)"

inherit rpm
