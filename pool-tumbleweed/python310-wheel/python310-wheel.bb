SUMMARY = "A built-package format for Python"
DESCRIPTION = "A built-package format for Python. \
 \
A wheel is a ZIP-format archive with a specially formatted filename \
and the .whl extension. It is designed to contain all the files for a \
PEP 376 compatible install in a way that is very close to the on-disk \
format. Many packages will be properly installed with only the 'Unpack' \
step (simply extracting the file onto sys.path), and the unpacked archive \
preserves enough information to 'Spread' (copy data and scripts to their \
final locations) at any later time."
LICENSE = "MIT"

PV = "0.40.0"

RPM_NAME = "python310-wheel-0.40.0-1.1.noarch.rpm"
RPM_HASH = "a92e72f580479c1baf505c8f2d21e09c80b9cf9864257afeb33bd13503ca86c85778429ead2bdf047cc147f244429c357497a3ad055aadfcc21e1ab241558889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wheel \
python3.10dist-wheel \
python310-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python-abi"

inherit rpm
