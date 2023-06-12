SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-pytest-forked-1.6.0-2.1.noarch.rpm"
RPM_HASH = "7bd06459502fdbc531cdfa95791e5acd960963dd74b47ca664caa544bfc9635be9959b6f6efe6085255f0d2482be71aea4b2a89dc5dfd2c5fa09c5b9262e10ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-forked) \
python311-pytest-forked \
python3dist(pytest-forked)"
RDEPENDS:${PN} += "python(abi) \
python311-py \
python311-pytest"

inherit rpm
