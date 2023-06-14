SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python311-pyModis-2.0.9-1.18.noarch.rpm"
RPM_HASH = "b17581a3751758fc1240ee65bf0cb1bf18e08f56076e1c843eedcd399a07160d04d41296fb9a828201f758179fcb3340b5000c324f97f0313abdab69ffe0e728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pymodis \
python311-pyModis \
python3dist-pymodis"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
