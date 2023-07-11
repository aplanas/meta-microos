SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python310-audio-degrader-1.3.1-1.12.noarch.rpm"
RPM_HASH = "53f312d1bf0bf69bcab898bc1ea735aae183a54fbdd5ee0e467cf2dea1cefb651bf895aef452ff45a80f12f72cf52dd5a6bd44bacb228feb1530924614b9e268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-audio-degrader \
python310-audio-degrader \
python3dist-audio-degrader"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-SoundFile \
python310-scipy \
python310-sox \
update-alternatives"

inherit rpm
