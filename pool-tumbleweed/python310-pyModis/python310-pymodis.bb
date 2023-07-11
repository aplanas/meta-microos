SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python310-pyModis-2.0.9-1.19.noarch.rpm"
RPM_HASH = "08f861a082b0b32556f9f57597cf19d588876b91a43341df816468592ece6f52ea167aa33113b7e8ea1b98fd9b2d183841373870fc902c7546c832aecca0243a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pymodis \
python310-pyModis \
python3dist-pymodis"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
