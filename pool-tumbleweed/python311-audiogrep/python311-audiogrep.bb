SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python311-audiogrep-0.1.5-2.16.noarch.rpm"
RPM_HASH = "f25c6179199534f54c66beabbb11e7577b84753b8ebd0db3d6cf2b0cbf7e5eaa781ffaca5e51b183bb1e3f4e194fd5cdbc38f1b300bc11fd39f17c45d7510dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(audiogrep) \
python311-audiogrep \
python3dist(audiogrep)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ffmpeg \
pocketsphinx \
python(abi) \
python311-pydub \
update-alternatives"

inherit rpm
