SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python311-pyModis-2.0.9-1.19.noarch.rpm"
RPM_HASH = "8e45f4578ea25cc04dd7609571275311ca23ae19eae4026296171285c2622f7de12a1d9afab22e850478566561d5aa4d48ff291b3710ccdbccb79c7a5d03d737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyModis \
python3.11dist-pymodis \
python311-pyModis \
python3dist-pymodis"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
