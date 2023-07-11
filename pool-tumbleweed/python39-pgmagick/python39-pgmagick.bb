SUMMARY = "Yet Another Python wrapper for GraphicsMagick"
DESCRIPTION = "The pgmagick package is a yet another boost.python based \
wrapper for GraphicsMagick."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python39-pgmagick-0.7.4-3.27.aarch64.rpm"
RPM_HASH = "11da6ac694cd31efe17d9c4709854935974ba9a67a26eff01e5ec375bd1f306ce82b5012e8e389ca31f5c68b27bbea4d2201a466df5c67f728adfed140ba32e6"

RPROVIDES:${PN} += "python3.9dist-pgmagick \
python39-pgmagick \
python3dist-pgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGraphicsMagick++-Q16.so.12 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
