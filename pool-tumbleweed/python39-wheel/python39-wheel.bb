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

RPM_NAME = "python39-wheel-0.40.0-1.1.noarch.rpm"
RPM_HASH = "f43d0e58c7dfb8675f5303fd27c5ec1259eb19dd981f1eaae788c3a0d6b935e23b72b881ec9009cdd25cd73620105ca71dea928e5898e4b5c2ce6a47291f662e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wheel) \
python39-wheel \
python3dist(wheel)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi)"

inherit rpm
