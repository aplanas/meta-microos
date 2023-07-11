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

RPM_NAME = "python311-pyproject-metadata-0.6.1-3.3.noarch.rpm"
RPM_HASH = "e646ac5c3f38299dd3539a42e6e9bf5f5781d01fa0b94f81d45386042a6678c76e61624890d4a26550a3baf7c2190dcf48f7f87644be9c162693b9d433233aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-metadata \
python3.11dist-pyproject-metadata \
python311-pyproject-metadata \
python3dist-pyproject-metadata"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
