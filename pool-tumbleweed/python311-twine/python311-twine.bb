SUMMARY = "Collection of utilities for interacting with PyPI"
DESCRIPTION = "Twine is a utility for publishing Python packages on PyPI. \
 \
Currently it supports registering projects, uploading distributions, and \
checking, if descriptions will render correctly."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python311-twine-4.0.2-1.3.noarch.rpm"
RPM_HASH = "c752f01b0ba2f126af663dd0537de33497e0176362778e1bdc4631c5988a96a72107ccfd5948020351f17582db7a01d608c85fa9f96aa46cd795031f221c4692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-twine \
python3.11dist-twine \
python311-twine \
python3dist-twine"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-importlib-metadata \
python311-keyring \
python311-pkginfo \
python311-readme-renderer \
python311-requests \
python311-requests-toolbelt \
python311-rfc3986 \
python311-rich \
update-alternatives"

inherit rpm
