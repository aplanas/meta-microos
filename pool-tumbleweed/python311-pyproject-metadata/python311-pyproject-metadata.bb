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

RPM_NAME = "python311-pyproject-metadata-0.7.1-1.1.noarch.rpm"
RPM_HASH = "c1890fb4772938ec33cc2c989a1cc08f7229368b9979a0379bc01e8bb57fcc191b25fe80e87ed7f5a6006e0fe229b898cbd01ba813625ccbc6b16a207262a369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-metadata \
python3.11dist-pyproject-metadata \
python311-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
