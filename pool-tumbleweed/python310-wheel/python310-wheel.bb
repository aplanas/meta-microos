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

RPM_NAME = "python310-wheel-0.40.0-1.3.noarch.rpm"
RPM_HASH = "f0c38d5ddc21ec37aadab78f4809c263d239a362ae6944a188a94e6807311ba58473c4a6a6871430ffdb124802b5de3930b7b59f9d2084f5a48002e5664a4bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wheel \
python310-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
