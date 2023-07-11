SUMMARY = "ASDF schemas for units"
DESCRIPTION = "This package provides ASDF schemas for validating unit tags."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python39-asdf-unit-schemas-0.1.0-1.3.noarch.rpm"
RPM_HASH = "7a4facc4377c5fe1ee7480ca50106f442c51bcf954fe988aadf7c105a4320062b69ec2d7a59773d213805bc5e11a6ecd1efa666c6747154500bf4c39a7b39e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-unit-schemas \
python39-asdf-unit-schemas \
python3dist-asdf-unit-schemas"

RDEPENDS:${PN} += "python-abi \
python39-asdf-standard"

inherit rpm
