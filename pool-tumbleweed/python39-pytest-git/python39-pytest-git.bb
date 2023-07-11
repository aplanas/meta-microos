SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-git-1.7.0-2.15.noarch.rpm"
RPM_HASH = "3c68c411560133b30050f2a84efbe2b9f8761afe9c15a2ef1fb8212911c4b4203eeeb33b6b46df132e14bd019dd492fd43c98ec7ef7226947f76e39cbbddf908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-git \
python39-pytest-git \
python3dist-pytest-git"

RDEPENDS:${PN} += "python-abi \
python39-GitPython \
python39-pytest \
python39-pytest-shutil"

inherit rpm
