SUMMARY = "Enhanced fork of youtube-dl, a video site downloader for offline watching"
DESCRIPTION = "yt-dlp is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.07.06"

RPM_NAME = "yt-dlp-2023.07.06-1.1.noarch.rpm"
RPM_HASH = "7f4dd0d5cd85d7a5efa6231e6693b79d020dd0bb49813b03814db31f097b3dbb294361ab68dd8275343014a0f210cd19f206e8dc45f362dabbb629a6e2407723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
python3"

inherit rpm
