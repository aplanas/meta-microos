SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python39-youtube-dl-2021.12.17-8.2.noarch.rpm"
RPM_HASH = "3f5e51738a148ac0ebbcb1d60a0e64e829766f2a886c669840ccbf49ab1c245a93937725e0100c1eab59ad7633aa4a98e961467bf6429bc3bef9af1f64b2083e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-youtube-dl \
python39-youtube-dl \
python3dist-youtube-dl"

RDEPENDS:${PN} += "ffmpeg \
python-abi \
python39-xml"

inherit rpm
