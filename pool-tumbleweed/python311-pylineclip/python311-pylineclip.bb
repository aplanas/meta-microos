SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pylineclip-1.0.0-2.10.noarch.rpm"
RPM_HASH = "a1bbb46cd23d83fc2cd8ef1376fe0fd955d12b1662994ce85b9c8fb5527f55964df9f3dc53d564b99008250cfdc8e5ecc6192f802f578f056f5cdeacc0c7b7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pylineclip) \
python311-pylineclip \
python3dist(pylineclip)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
