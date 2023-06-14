SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python39-audio-degrader-1.3.1-1.10.noarch.rpm"
RPM_HASH = "6e19b32c35b9b939be0e5d8a311be51c686a980890204a01479fb23270b8ae3fbf04e6cf00c5bb48c1b7d709f8687cd91a1628fb9a3b55d442fb17dda54732c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-audio-degrader \
python39-audio-degrader \
python3dist-audio-degrader"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-SoundFile \
python39-scipy \
python39-sox \
update-alternatives"

inherit rpm
