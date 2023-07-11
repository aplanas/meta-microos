SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python39-pyux-0.0.6-1.15.noarch.rpm"
RPM_HASH = "381d2deb40a08845eef96ef2a4322e3a28d0fc06e681c022037b1cc27aaeb072a7120f42ee68f7da44b9c0d839b81722002cc7cafb2b53559624e850af778205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyux \
python39-pyux \
python3dist-pyux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
