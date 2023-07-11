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

RPM_NAME = "python311-wheel-0.40.0-1.3.noarch.rpm"
RPM_HASH = "41cec2ba81499ad725b3932aad3e2fa1b97c6268b232b9b47bfdc500fb982c6363935ee8423819b27d652f5b7450849c70b0f89b7302a19918826d43bb8824f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wheel \
python3.11dist-wheel \
python311-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
