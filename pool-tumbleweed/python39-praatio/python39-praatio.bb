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

RPM_NAME = "python39-praatio-4.1.0-1.14.noarch.rpm"
RPM_HASH = "20f77109d2cdf54499a36e7b77d343b93d132c440660a35a2cfca6a8e08f9278e1d23222b14f2f607d3924fd3e897446c09dbc962bfece2b65834af1ddb7f3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-praatio \
python39-praatio \
python3dist-praatio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
