SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python310-audiogrep-0.1.5-2.18.noarch.rpm"
RPM_HASH = "1ec8a2495a1aba551197f4f56dbc2c661c7eb91d4dd327d78556555e0929e2f820a77a0fb4039ff81ff32c99b32759498317b6f7167c4112fcfe174b35309a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-audiogrep \
python310-audiogrep \
python3dist-audiogrep"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ffmpeg \
pocketsphinx \
python-abi \
python310-pydub \
update-alternatives"

inherit rpm
