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

RPM_NAME = "python311-discid-1.2.0-2.1.noarch.rpm"
RPM_HASH = "44ec15feae0cc3f58da8cf1cb428d5d6343b6cb958d76637b71791f53748ef4d9f2cac9fa50db289c90c662a6d5bee61bbe46aa1e92d83776058dbac025e3f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-discid \
python3.11dist-discid \
python311-discid \
python3dist-discid"

RDEPENDS:${PN} += "libdiscid0 \
python-abi"

inherit rpm
