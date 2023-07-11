SUMMARY = "Terminal string styling done right, in Python"
DESCRIPTION = "colorful gives you control over terminal string styling in Python \
with an easy to use API."
LICENSE = "MIT"

PV = "0.5.5"

RPM_NAME = "python311-colorful-0.5.5-1.5.noarch.rpm"
RPM_HASH = "ec2262b80f73f1772360e1d53377ab02e0949032768ac87a006b5a7dcc2620903cdcfa5d1657bb5b373cda9fb687d25b065f2733f0dec2b8150a5c368a34aff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorful \
python3.11dist-colorful \
python311-colorful \
python3dist-colorful"

RDEPENDS:${PN} += "python-abi"

inherit rpm
