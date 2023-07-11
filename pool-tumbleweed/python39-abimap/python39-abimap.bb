SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-abimap-0.3.2-3.12.noarch.rpm"
RPM_HASH = "b621bbdc56986cedb257d718e9ae657e2009177d755ab3a986a64c4c263a2e1cd9e7b545904c3e2001d333bba88849926fae4a6df2ac6f39981d6cf00914afbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-abimap \
python39-abimap \
python3dist-abimap"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
