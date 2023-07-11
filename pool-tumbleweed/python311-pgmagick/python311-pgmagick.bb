SUMMARY = "Yet Another Python wrapper for GraphicsMagick"
DESCRIPTION = "The pgmagick package is a yet another boost.python based \
wrapper for GraphicsMagick."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python311-pgmagick-0.7.4-3.27.aarch64.rpm"
RPM_HASH = "c7e31fd1639093d4831e24b8852a004500c2b9cdf15f9176a07a438c02c48df236c335c3c2eebab2f05548ca39670258067f90fba5f4c91a1d4b4a4fc43e01c0"

RPROVIDES:${PN} += "python3-pgmagick \
python3.11dist-pgmagick \
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
