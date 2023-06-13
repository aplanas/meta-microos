SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python310-twine-4.0.2-1.1.noarch.rpm"
RPM_HASH = "65883732bcc5e31bafa802dd26b1c3180246d7ce520be88dcd4a28bdc62c7e5209cb78a2f97d1ea4c08ae7ed1bf54ea539369634c2ca65902890d56005c52f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twine \
python3.10dist(twine) \
python310-twine \
python3dist(twine)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-importlib-metadata \
python310-keyring \
python310-pkginfo \
python310-readme_renderer \
python310-requests \
python310-requests-toolbelt \
python310-rfc3986 \
python310-rich \
update-alternatives"

inherit rpm
