SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-blockdiag-3.0.0-2.1.noarch.rpm"
RPM_HASH = "4429a5b4bc1cd389a306a96c0d61d7da1a08479e66fad1b9317070f69a6f63936fd6dadb684965138444d5cc7a2687b502c91c454c1eaa87682777055c19205a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blockdiag \
python3.10dist-blockdiag \
python310-blockdiag \
python3dist-blockdiag"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Pillow \
python310-funcparserlib \
python310-setuptools \
python310-webcolors \
update-alternatives"

inherit rpm
