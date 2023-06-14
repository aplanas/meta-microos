SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-blockdiag-3.0.0-2.1.noarch.rpm"
RPM_HASH = "d207a4792b145e612bfad8e0dce3b6f4d6cde679b13ffa90679adc4a2c255f81fba44ebe5a673e72db9387a2c4df2cdf70c3f933c7ed5dcb141054472d0b8151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-blockdiag \
python39-blockdiag \
python3dist-blockdiag"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Pillow \
python39-funcparserlib \
python39-setuptools \
python39-webcolors \
update-alternatives"

inherit rpm
