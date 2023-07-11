SUMMARY = "Documentation for the LAME MP3 encoder"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-doc-3.100-5.4.aarch64.rpm"
RPM_HASH = "7dc6a6d63097c8184d634fd3d8c554c231a945631c2e1ac5fc3891fd7af8b70e2d7460d4c681de2d2ab69e849547cdc8436aa99c270d73bd99867908ad12256d"

RPROVIDES:${PN} += "lame-doc"

RDEPENDS:${PN} += "lame"

inherit rpm
