SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python39-youtube-dl-2021.12.17-8.1.noarch.rpm"
RPM_HASH = "0fdd29f316c452bb68130d0577dbb0cfa19e180d1e07649b5b44c0f54e1a9d0fd2e93a2f1258446e19b5aca2e3dad7c5d635fd4878ee52fe6677c501942f8b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-youtube-dl \
python39-youtube-dl \
python3dist-youtube-dl"

RDEPENDS:${PN} += "ffmpeg \
python-abi \
python39-xml"

inherit rpm
