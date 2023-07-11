SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python39-audiogrep-0.1.5-2.18.noarch.rpm"
RPM_HASH = "d1f02fcaed9a93db53a394b43521962872020bff09f7e853288fd88f6d862177b662b6e123cd78cf90d502cd2b44f447351fb29d9fc468c1775eba89f9f5d3ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-audiogrep \
python39-audiogrep \
python3dist-audiogrep"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ffmpeg \
pocketsphinx \
python-abi \
python39-pydub \
update-alternatives"

inherit rpm
