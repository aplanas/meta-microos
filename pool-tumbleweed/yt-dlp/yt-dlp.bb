SUMMARY = "Enhanced fork of youtube-dl, a video site downloader for offline watching"
DESCRIPTION = "yt-dlp is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.06.22"

RPM_NAME = "yt-dlp-2023.06.22-1.1.noarch.rpm"
RPM_HASH = "eb0b898bb3e1cabd1f117df367cee24b4976f1bf615ad6d34edbeb7e3152f24e6e84c60301a348a5114f18b5a0879f8c6b3082cb6313b362a677716210cd11ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
python3"

inherit rpm
