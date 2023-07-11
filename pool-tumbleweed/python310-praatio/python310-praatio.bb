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

RPM_NAME = "python310-praatio-4.1.0-1.14.noarch.rpm"
RPM_HASH = "5c77913218c933d7e2aec5f206a40795daba8fa86065f3b06e48345d06bce5962782e631aeb49dea747cde6575c7e23ced2b607af3dcda61cb70c5969b949c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-praatio \
python310-praatio \
python3dist-praatio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
