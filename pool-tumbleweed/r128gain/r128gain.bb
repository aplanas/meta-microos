SUMMARY = "Fast audio loudness (ReplayGain / R128) scanner & tagger"
DESCRIPTION = "Fast audio loudness (ReplayGain / R128) scanner & tagger."
LICENSE = "LGPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "r128gain-1.0.7-1.2.noarch.rpm"
RPM_HASH = "c1064891627074b64d2bcbfe7f337665aa3869d6dc232ee60ea5c7d9575f5a09471be222c1a3ea73774ac3a633e5dc15d06310ca75678c886480f4d6814b534b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-r128gain \
python3dist-r128gain \
r128gain"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-crcmod \
python3-ffmpeg-python \
python3-future \
python3-mutagen \
python3-tqdm"

inherit rpm
