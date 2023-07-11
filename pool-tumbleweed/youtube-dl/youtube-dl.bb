SUMMARY = "A tool for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-2021.12.17-8.1.noarch.rpm"
RPM_HASH = "9820709dca9242ac682a2c8059ac393001d037e8b4cac9078ccdacea216e5bb42ad97ebf2f4a5fc74e0f52c43f5581db75d21d1481591f041e6513e6b7b37927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
python3 \
python3-xml"

inherit rpm
