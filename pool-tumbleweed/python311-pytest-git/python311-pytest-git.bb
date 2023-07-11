SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-git-1.7.0-2.15.noarch.rpm"
RPM_HASH = "3e3129c2647c6dd48d7081bae40b1169f32a6ec82f6d0502dbf9f63699682884631e29ed38331c5f320bf2a5c09b731391f6187d5e6d7083ae76c716e209b07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-git \
python3.11dist-pytest-git \
python311-pytest-git \
python3dist-pytest-git"

RDEPENDS:${PN} += "python-abi \
python311-GitPython \
python311-pytest \
python311-pytest-shutil"

inherit rpm
