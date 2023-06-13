SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python39-youtube-dl-2021.12.17-7.1.noarch.rpm"
RPM_HASH = "3b463ec5c76a647596163e49616bdbfac96ce3b378e049480a78c94a1368e9e4fbeb48d95fd58ac68f0c06602f85741505d77affcb091bb201f17461465e6d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(youtube-dl) \
python39-youtube-dl \
python3dist(youtube-dl)"

RDEPENDS:${PN} += "ffmpeg \
python(abi) \
python39-xml"

inherit rpm
