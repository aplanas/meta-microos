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

RPM_NAME = "python39-pyproject-metadata-0.6.1-3.3.noarch.rpm"
RPM_HASH = "a7e31a26eff58c66f58447637598a98b02e1480f31d474c77e075e4840d2df36642650f85fd8dfc8ff608a78c2bdc8725d69851a14866676b1b9fec8c5cbd3bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyproject-metadata \
python39-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python39-packaging"

inherit rpm
