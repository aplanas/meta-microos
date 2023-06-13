SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pylineclip-1.0.0-2.10.noarch.rpm"
RPM_HASH = "7fc1abce399fc34bb3b32f129d6bb3aa4041ec136c313917a89270a55340acd29afe0bf6638b2846e4c616935fade81d35a029c67c670781e065194af0bc00c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylineclip \
python3.10dist(pylineclip) \
python310-pylineclip \
python3dist(pylineclip)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
