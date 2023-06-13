SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python311-youtube-dl-2021.12.17-7.1.noarch.rpm"
RPM_HASH = "aec4931676b694462b56667f945432725c549d10e60c2040e0abd17409eff266110df650e3fe50a9578c936eacd81c98935a5d19d9742f5e3429632517a17c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(youtube-dl) \
python311-youtube-dl \
python3dist(youtube-dl)"

RDEPENDS:${PN} += "ffmpeg \
python(abi) \
python311-xml"

inherit rpm
