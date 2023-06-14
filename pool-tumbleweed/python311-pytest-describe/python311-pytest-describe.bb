SUMMARY = "Describe-style plugin for pytest"
DESCRIPTION = "Describe-style plugin for pytest."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-pytest-describe-2.1.0-1.1.noarch.rpm"
RPM_HASH = "e15cfd8a06240e6e9c40e95f3cb9e91ee8a7dc614879ad59600f61453ff9f068614b9b172ad97fe107213a40fdfcb1bd32e0c72ad03645d7c555e88c0e951272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-describe \
python311-pytest-describe \
python3dist-pytest-describe"

RDEPENDS:${PN} += "python-abi \
python311-py \
python311-pytest"

inherit rpm
