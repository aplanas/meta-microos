SUMMARY = "CPython's PEG parser generator"
DESCRIPTION = "CPython's PEG parser generator"
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-pegen-0.2.0-1.2.noarch.rpm"
RPM_HASH = "238ff773c21b8edce8d88c60c2d2335ad19cce33de0b8299b2e11b4d796b742760a59088d9c834d555be7b81b19eb750259e67d9724e0bba3e296ebcc6596e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pegen \
python3.10dist(pegen) \
python310-pegen \
python3dist(pegen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
