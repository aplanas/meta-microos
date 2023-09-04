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

RPM_NAME = "python39-pyproject-metadata-0.7.1-1.1.noarch.rpm"
RPM_HASH = "438a64c2fa16dd64eea7c62161775dba0b7c26629324d48d941ec50a4f5929d8d45f1e94bb404313a3694505625244a5d17d67d9d1d370c60fa4cd8aa5a755e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyproject-metadata \
python39-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python39-packaging"

inherit rpm
