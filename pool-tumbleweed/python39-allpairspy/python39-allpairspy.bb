SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-allpairspy-2.5.0-2.3.noarch.rpm"
RPM_HASH = "3760584bc1d85c7020785d8fde91b434a796c5e3e2f41ed2234ec02ddc487e5ae450d6f6d4d770123aa07b6b757227d889ffedf748f0181af3ff730fae6a427f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-allpairspy \
python39-allpairspy \
python3dist-allpairspy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
