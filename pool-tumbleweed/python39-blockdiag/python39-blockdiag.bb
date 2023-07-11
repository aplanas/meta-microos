SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-blockdiag-3.0.0-2.3.noarch.rpm"
RPM_HASH = "aee477d013b33957a8124f9de90fa418439a08a6c418cd5ad3fab7ea57657ff9db8f82f05152835f2ec3d89c4ee483704f89badf47eab2c663cc1b74336d4793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blockdiag \
python39-blockdiag \
python3dist-blockdiag"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-funcparserlib \
python39-setuptools \
python39-webcolors \
update-alternatives"

inherit rpm
