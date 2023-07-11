SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-shinyutils-3.1.0-2.11.noarch.rpm"
RPM_HASH = "1b1bc3e3c1813ea35a403ac0140f70e8cf1e8181b2ffb3d6d689bd32ed1029c6b99949313e9156c81f5c195de6cb78006faf06c5eb28a71bcf4843e274a01f8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-shinyutils \
python310-shinyutils \
python3dist-shinyutils"

RDEPENDS:${PN} += "python-abi \
python310-crayons \
python310-matplotlib \
python310-seaborn"

inherit rpm
