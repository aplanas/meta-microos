SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python311-youtube-dl-2021.12.17-8.1.noarch.rpm"
RPM_HASH = "99f0d70ded5d56999aee0317a49f5b1aa7e318d84949b22db2036ef6043a606888a39c2457d8c49200cf7e7161f6ec69d28c0cea151b0bc9508eb60968bec863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-youtube-dl \
python3.11dist-youtube-dl \
python311-youtube-dl \
python3dist-youtube-dl"

RDEPENDS:${PN} += "ffmpeg \
python-abi \
python311-xml"

inherit rpm
