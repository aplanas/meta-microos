SUMMARY = "A library for working with praat"
DESCRIPTION = "A library for working with praat, time aligned audio transcripts, and \
audio files. \
 \
Praat uses a file format called textgrids, which are time aligned \
speech transcripts. This library also provides utilities are to work \
with  transcripts and associated audio file and some other tools for \
use with praat."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-praatio-4.1.0-1.14.noarch.rpm"
RPM_HASH = "fb954be059f066aeef22c5047df103e7defc3b5c930e1ef3a2f9d1e343380cb685e1396256dded33133ad05aa8f5ad053ac32e064f6a5e827d35c7d71a0a6abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-praatio \
python3.11dist-praatio \
python311-praatio \
python3dist-praatio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
