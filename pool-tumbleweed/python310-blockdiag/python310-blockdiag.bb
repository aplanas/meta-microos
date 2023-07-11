SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-blockdiag-3.0.0-2.3.noarch.rpm"
RPM_HASH = "beea220fdec9fc0704cbe14611400132265e7a160c0c1d147b87a7046ba2194102ed802074dc9b5fa67be5442839425daea85fc44e72da0a1bf5be2a729e86f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-blockdiag \
python310-blockdiag \
python3dist-blockdiag"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-funcparserlib \
python310-setuptools \
python310-webcolors \
update-alternatives"

inherit rpm
