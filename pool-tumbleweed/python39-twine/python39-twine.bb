SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python39-twine-4.0.2-1.3.noarch.rpm"
RPM_HASH = "c4d64910fb671e3adf00250e52e4d8f324945a439f0308caf714610dac97a1870d801f95689618c383e9dc815653a070da069758b518b30110d24965b0154786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-twine \
python39-twine \
python3dist-twine"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-importlib-metadata \
python39-keyring \
python39-pkginfo \
python39-readme-renderer \
python39-requests \
python39-requests-toolbelt \
python39-rfc3986 \
python39-rich \
update-alternatives"

inherit rpm
