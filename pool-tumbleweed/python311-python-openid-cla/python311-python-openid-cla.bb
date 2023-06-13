SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python311-python-openid-cla-1.2-1.18.noarch.rpm"
RPM_HASH = "0ccde4872094dec7d1227df2e5733b3ac72f4ea2f77c55ae7a84fed61e0e756ae123a3d56e6aba1d2086fccb22daf965491125debd778b663eb1ae6256a71e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-openid-cla) \
python311-python-openid-cla \
python3dist(python-openid-cla)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
