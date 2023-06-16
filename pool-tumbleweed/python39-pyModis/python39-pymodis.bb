SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python39-pyModis-2.0.9-1.18.noarch.rpm"
RPM_HASH = "649c57bd3c8b84dee37f3950cf0401205ef4dab83df23f47736595e0d91e8892fb3e42913cafe204c58fca0ac85c8944aebb383eaaf343fb495784a7f5a756e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymodis \
python39-pyModis \
python3dist-pymodis"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
