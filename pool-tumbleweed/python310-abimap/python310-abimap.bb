SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-abimap-0.3.2-3.10.noarch.rpm"
RPM_HASH = "52c94859107b9fbd41256954090c566f61c34a22eb1f8c2b446ea80df438588d8d05e1bc861ebbf47e2d4abdb41b25f62e87ab6aad47bee180969054d6ce8dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abimap \
python3.10dist-abimap \
python310-abimap \
python3dist-abimap"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
