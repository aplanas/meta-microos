SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python311-youtube-dl-2021.12.17-8.2.noarch.rpm"
RPM_HASH = "ca59e78e364c08cc4c2b174cfc251ad603c965b1445515a0b2ac4c4fbefaf9fbbff3ed045c82a894f52b7865ef5b9e4e0854ffd7760002ef74653fb2f51b3971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-youtube-dl \
python3.11dist-youtube-dl \
python311-youtube-dl \
python3dist-youtube-dl"

RDEPENDS:${PN} += "ffmpeg \
python-abi \
python311-xml"

inherit rpm
