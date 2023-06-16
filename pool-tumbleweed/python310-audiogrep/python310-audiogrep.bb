SUMMARY = "Python package to create audio supercuts"
DESCRIPTION = "Audiogrep transcribes audio files and then creates 'audio supercuts' \
based on search phrases."
LICENSE = "MIT"

PV = "0.1.5"

RPM_NAME = "python310-audiogrep-0.1.5-2.16.noarch.rpm"
RPM_HASH = "28bca5cea679eddaf143a33c464195f98cf398f3df2ece761954a2ed626c9c4885d5addd924131fd3fa2c68fde59351c4a1cd06893de7ecbf09a08840423504d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audiogrep \
python3.10dist-audiogrep \
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
