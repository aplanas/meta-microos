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

PV = "0.6.1"

RPM_NAME = "python311-pyproject-metadata-0.6.1-3.1.noarch.rpm"
RPM_HASH = "32c061c3e88cce408450a6875dc1ed11a5a4767f45e4eb3e31692d77e5a4ed6e21767027f7bbbb337e15da81722507052aa6899fe573a5cf36ea2065b340bb01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyproject-metadata \
python311-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
