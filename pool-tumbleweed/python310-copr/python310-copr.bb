SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "1.129"

RPM_NAME = "python310-copr-1.129-1.1.noarch.rpm"
RPM_HASH = "73de0d61008954cc31560fcc318aae7c83b50899469bb6c5ddbcc32204b50486dd9f373de40751fe1beb3553231df9aa4654dc2c908e44b9d25c92c686d885be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-copr \
python310-copr \
python3dist-copr"

RDEPENDS:${PN} += "python-abi \
python310-filelock \
python310-future \
python310-munch \
python310-requests \
python310-requests-toolbelt"

inherit rpm
