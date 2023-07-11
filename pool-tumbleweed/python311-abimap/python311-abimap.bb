SUMMARY = "A helper for library maintainers to use symbol versioning"
DESCRIPTION = "This script allows to generate and update symbol version linker scripts which \
adds version information to the exported symbols. The script is intended to be \
integrated as part of a shared library build to check for changes in the set of \
exported symbols and update the symbol version linker script accordingly."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-abimap-0.3.2-3.12.noarch.rpm"
RPM_HASH = "b662130188fdaec1971d1986a9c8190040c8d4ad5dcf478eda8848f7546402a2092b622e65886972ab808beda318e5415c3f0d66b5bcbe3b35e223b0c1fc34f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abimap \
python3.11dist-abimap \
python311-abimap \
python3dist-abimap"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
