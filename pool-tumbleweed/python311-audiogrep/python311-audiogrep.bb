SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python311-audiogrep-0.1.5-2.18.noarch.rpm"
RPM_HASH = "2ea743dde2613e4b396b9b4f8c5b692305f7f0dca0301fcbc5dd5e703fa7839cd15fdf4c5c20358c7298fc885e8601fd912b3aee9fc05593073b0cb4d6c136fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audiogrep \
python3.11dist-audiogrep \
python311-audiogrep \
python3dist-audiogrep"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ffmpeg \
pocketsphinx \
python-abi \
python311-pydub \
update-alternatives"

inherit rpm
