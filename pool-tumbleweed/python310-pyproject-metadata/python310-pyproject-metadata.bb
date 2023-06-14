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

RPM_NAME = "python310-pyproject-metadata-0.6.1-3.1.noarch.rpm"
RPM_HASH = "ba02270dd42ad85d21debb4d6b2750fa98f913cf106268071302a942a155fbca49ab7b4025c44b741fce5d9f28d2c20ea0c7468f5a4f495ccc0a5620165181cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-metadata \
python3.10dist-pyproject-metadata \
python310-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm
