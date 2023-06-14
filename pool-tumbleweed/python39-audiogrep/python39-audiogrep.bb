SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python39-audiogrep-0.1.5-2.16.noarch.rpm"
RPM_HASH = "8fb190a81cca32c2b9433ec26f18f583feef2cbaa3f203a0bf1bc0a8c75c4b5890e339c275d37b3cfd49731be0d0cf471daea5cd872b88cc4f930425c451d8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-audiogrep \
python39-audiogrep \
python3dist-audiogrep"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ffmpeg \
pocketsphinx \
python-abi \
python39-pydub \
update-alternatives"

inherit rpm
