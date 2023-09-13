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

PV = "0.41.2"

RPM_NAME = "python39-wheel-0.41.2-2.1.noarch.rpm"
RPM_HASH = "53c69d6627a4d96afcd8ca4114567eebd731f6f5cbb66c8f91f477a5c0a0bee1b1e433c5232f287174d8dac6cc6c62a148c9ecb524e2b583452ee76cd25382dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wheel \
python39-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
