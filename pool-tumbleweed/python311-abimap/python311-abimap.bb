SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-abimap-0.3.2-3.10.noarch.rpm"
RPM_HASH = "68d961387d8556bd8147d978c10ff7e044a66780c48dfc9faae972b6c7ac39b2160b36f734e123732537b7ffa78ae2512c916e651081fc14eeba52df7b7e9dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(abimap) \
python311-abimap \
python3dist(abimap)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
