SUMMARY = "PEP 621 metadata parsing"
DESCRIPTION = "Dataclass for PEP 621 metadata with support for core metadata generation \
 \
This project does not implement the parsing of `pyproject.toml` \
containing PEP 621 metadata. \
 \
Instead, given a Python data structure representing PEP 621 metadata (already \
parsed), it will validate this input and generate a PEP 643-compliant metadata \
file (e.g. `PKG-INFO`)."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-pyproject-metadata-0.7.1-1.1.noarch.rpm"
RPM_HASH = "835763206aa43ca8ffaf8909f961aa96865d1711a1398cb5866ae0f67f267490697059294f60faba6aea833dc590cdb593c71735fabd9456131b414659b8dcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyproject-metadata \
python310-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm
