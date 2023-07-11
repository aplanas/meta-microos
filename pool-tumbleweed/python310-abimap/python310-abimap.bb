SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-abimap-0.3.2-3.12.noarch.rpm"
RPM_HASH = "5b22d5a1c6304643897472e0851a3841a0c6bc2d97d2c8db1ed60cdd08a85c63017c1c5ea193bd9dbc020e64b0dcac0b2979abe3bce34d91de7da040cfc62edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-abimap \
python310-abimap \
python3dist-abimap"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
