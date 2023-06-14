SUMMARY = "Yet Another Python wrapper for GraphicsMagick"
DESCRIPTION = "The pgmagick package is a yet another boost.python based \
wrapper for GraphicsMagick."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python311-pgmagick-0.7.4-3.25.aarch64.rpm"
RPM_HASH = "6f77523179f2f0f65ec75aaf70020522f1130bb6fe73a25e2ce52bb6ed1319b13e121d653c231f9c9249bace5474e8c3bab70989b84667d4da0888bc08103610"

RPROVIDES:${PN} += "python3.11dist-pgmagick \
python311-pgmagick \
python3dist-pgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGraphicsMagick++-Q16.so.12 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
