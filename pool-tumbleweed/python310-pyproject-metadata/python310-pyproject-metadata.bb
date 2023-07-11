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

RPM_NAME = "python310-pyproject-metadata-0.6.1-3.3.noarch.rpm"
RPM_HASH = "22ba75305164d5290eef3f7760274d9f10f57ce85f90492fd128d98a0a7486f2dbc5b3c19a3f64b2669237e26af19fb4704469fd76cd966626fc99582d49b491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyproject-metadata \
python310-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm
