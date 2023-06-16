SUMMARY = "Program to generate block-diagram images from text"
DESCRIPTION = "The blockdiag package generates block-diagram image files \
from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-blockdiag-3.0.0-2.1.noarch.rpm"
RPM_HASH = "f506809d8e7815d9d9b6d7956dc9867b644fcdd30b25b3beaef34df45d49a561ae77f7ad83d6c324ddc3d8a5f4bf0570818a42d64d300216d8463f5f2a50e0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-blockdiag \
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
