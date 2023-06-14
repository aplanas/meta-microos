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

RPM_NAME = "python311-praatio-4.1.0-1.12.noarch.rpm"
RPM_HASH = "387ae73caa3df704b7c1684463a546b844a9a36df6981d4161e3e11258c3f55492151a01472e37961f69ab9b5396d1199946aac87d068a5d85f80f46abd0ab73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-praatio \
python311-praatio \
python3dist-praatio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
