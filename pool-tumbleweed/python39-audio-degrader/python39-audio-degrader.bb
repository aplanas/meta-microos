SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python39-audio-degrader-1.3.1-1.12.noarch.rpm"
RPM_HASH = "ad050b0fd936933010e2f3e126ac9d81d4aa2a4bdb7668742a6912996e201eb34891ec01c4735ce18d658231e4f68e8230be67a3f6d5b45ddfea107b9a97ef3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-audio-degrader \
python39-audio-degrader \
python3dist-audio-degrader"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-SoundFile \
python39-scipy \
python39-sox \
update-alternatives"

inherit rpm
