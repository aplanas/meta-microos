SUMMARY = "Pairwise test combinations generator"
DESCRIPTION = "Pairwise test combinations generator."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-allpairspy-2.5.0-2.5.noarch.rpm"
RPM_HASH = "a6559eb2b7390bcec19470eb07e2ce2f273dd5b989621ebf1e8d8827126b26cf2df6641ad83b6a4764ad9f420fcbf9868c93c2871fce65a81cc435285b30b039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-allpairspy \
python39-allpairspy \
python3dist-allpairspy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
