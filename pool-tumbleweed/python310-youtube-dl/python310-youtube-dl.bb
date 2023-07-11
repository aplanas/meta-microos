SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python310-youtube-dl-2021.12.17-8.1.noarch.rpm"
RPM_HASH = "9187b7992914acfba6e52c174e6b74363ae88d7453e294d00e65dc1c0c14f0691077072430e34d43c6572e481d5d911e0e65dfb284e7fd48300a149db667b5e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-youtube-dl \
python310-youtube-dl \
python3dist-youtube-dl"

RDEPENDS:${PN} += "ffmpeg \
python-abi \
python310-xml"

inherit rpm
