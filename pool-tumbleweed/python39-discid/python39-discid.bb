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

RPM_NAME = "python39-discid-1.2.0-1.15.noarch.rpm"
RPM_HASH = "257fd6be01ac1a717dff3914a1b2fe98869d285dc6b20b3252f76eaafb95d11e3434a60638857e391ff3673c95482a8da514e8efa6df5993fde00790f778f536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-discid \
python39-discid \
python3dist-discid"

RDEPENDS:${PN} += "libdiscid0 \
python-abi"

inherit rpm
