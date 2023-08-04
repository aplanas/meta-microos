SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python310-youtube-dl-2021.12.17-8.2.noarch.rpm"
RPM_HASH = "8de1b0d91a176f1399c0ed5d91ca0619536095a36fa513dfabd009e9d311ea2671a449d20467e2f8d56dffa25e7113642c6b6ace9f17d3b1a734612b43193322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-youtube-dl \
python310-youtube-dl \
python3dist-youtube-dl"

RDEPENDS:${PN} += "ffmpeg \
python-abi \
python310-xml"

inherit rpm
