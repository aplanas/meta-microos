SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python311-ttp-0.9.4-1.3.noarch.rpm"
RPM_HASH = "16ca2d3d8fb19a69bcef214d0b36ac0c97ad93732b3cedd0bbb61ca1e78a4c9f81a54fc397a8d8767de7a41b76daadfefea86294f3966b47643699f8a05b6102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ttp \
python3.11dist-ttp \
python311-ttp \
python3dist-ttp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
