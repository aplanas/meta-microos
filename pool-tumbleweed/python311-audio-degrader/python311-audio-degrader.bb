SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python311-audio-degrader-1.3.1-1.10.noarch.rpm"
RPM_HASH = "77b743af841d1baf0131d1219192cc1645f8bcb97706489482e676d8334cab3ecf149160aad334220dda8ef0a00c114a38d19d1ec6e844eb066fb355728a8dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(audio-degrader) \
python311-audio-degrader \
python3dist(audio-degrader)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-SoundFile \
python311-scipy \
python311-sox \
update-alternatives"

inherit rpm
