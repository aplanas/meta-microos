SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python310-twine-4.0.2-1.3.noarch.rpm"
RPM_HASH = "0448ceae314c2d508b6cd215bf025bdae5ce2b26b38c06014562de816ac12b561ced77b17af32c4f1c6bd57d22f77b9d047f0e3ae8b3432635c68057a087db9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-twine \
python310-twine \
python3dist-twine"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-importlib-metadata \
python310-keyring \
python310-pkginfo \
python310-readme-renderer \
python310-requests \
python310-requests-toolbelt \
python310-rfc3986 \
python310-rich \
update-alternatives"

inherit rpm
