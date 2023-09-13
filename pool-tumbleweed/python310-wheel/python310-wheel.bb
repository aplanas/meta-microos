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

RPM_NAME = "python310-wheel-0.41.2-2.1.noarch.rpm"
RPM_HASH = "de77120691e37fde56ad9db68e02329f62adac0d98349d9725097cd79bed988852821f0b469493d78b47de0fe53ce4316204d090612e0936fa6a3bd6b66b4aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wheel \
python310-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
