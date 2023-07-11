SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python311-audio-degrader-1.3.1-1.12.noarch.rpm"
RPM_HASH = "105c975c78ccbd401efa11f342dbd33d673c42b9997e1398ef22a5b1b47db6be7ee7a19b0b7b7ae7c9faa023ac8c79da8877037098ec26743d9402f9c7227aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audio-degrader \
python3.11dist-audio-degrader \
python311-audio-degrader \
python3dist-audio-degrader"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-SoundFile \
python311-scipy \
python311-sox \
update-alternatives"

inherit rpm
