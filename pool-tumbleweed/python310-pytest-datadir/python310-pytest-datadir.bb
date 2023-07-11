SUMMARY = "Plugin for test data directories and files"
DESCRIPTION = "pytest plugin for test data directories and files."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python310-pytest-datadir-1.4.1-1.3.noarch.rpm"
RPM_HASH = "3871e38565f3d3c874c9688a8cf0b24c41b87b2fcc733e7bc00c4434d4034df05d86bf324c0df6965cbc615035322da474d9082e4b07365b6e13393b4c8cca74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-datadir \
python310-pytest-datadir \
python3dist-pytest-datadir"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
