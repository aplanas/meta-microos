SUMMARY = "Python library for MODIS data"
DESCRIPTION = "The Moderate Resolution Imaging Spectroradiometer (MODIS) is a \
payload imaging sensor built by Santa Barbara Remote Sensing that was \
launched into Earth orbit by NASA in 1999 on board the Terra (EOS AM) \
Satellite, and in 2002 on board the Aqua (EOS PM) satellite. \
pyModis is a Python library to download and process MODIS data from \
NASA servers."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.9"

RPM_NAME = "python310-pyModis-2.0.9-1.18.noarch.rpm"
RPM_HASH = "e6b441138ede6d8f3f67594152b3d80d7610f1ff1b81073e30300e104b4ecce8e837dfa7bace4a58dc1a9cb7d5b3ab5688ddb42bbeecd32a409b6ef5f96421ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyModis \
python3.10dist(pymodis) \
python310-pyModis \
python3dist(pymodis)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
