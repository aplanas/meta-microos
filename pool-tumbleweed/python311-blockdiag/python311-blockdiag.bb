SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-blockdiag-3.0.0-2.3.noarch.rpm"
RPM_HASH = "f898f10772e0494ad1f6148e8041ad7df74d0501e2ad09a7a075d2355376a4f1ee4558e71fc13a2f7cd87f9ca975e3a96ac59b6506127889306b32e86b27f96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blockdiag \
python3.11dist-blockdiag \
python311-blockdiag \
python3dist-blockdiag"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-funcparserlib \
python311-setuptools \
python311-webcolors \
update-alternatives"

inherit rpm
