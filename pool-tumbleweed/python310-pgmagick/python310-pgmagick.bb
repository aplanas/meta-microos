SUMMARY = "Yet Another Python wrapper for GraphicsMagick"
DESCRIPTION = "The pgmagick package is a yet another boost.python based \
wrapper for GraphicsMagick."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-pgmagick-0.7.4-3.27.aarch64.rpm"
RPM_HASH = "74c14ebb1e47b8714005260686597a6b7e2cbd315578fa190415f2571daf9529383685d7182d854a8863dfecf2e3867de8ef57d4f0138b9a16587d8b5f25ce49"

RPROVIDES:${PN} += "python3.10dist-pgmagick \
python310-pgmagick \
python3dist-pgmagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGraphicsMagick++-Q16.so.12 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
