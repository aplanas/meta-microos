SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python39-pyModis-2.0.9-1.19.noarch.rpm"
RPM_HASH = "4a962d461c49f09ef859227ea1c5bee88e0b72a14d6572f66278b3558a566ebe85fc9b191764390bd5b260446920d26c1119f6a9342bc2d59f12deaf1885eed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymodis \
python39-pyModis \
python3dist-pymodis"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
