SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-pytest-forked-1.6.0-2.3.noarch.rpm"
RPM_HASH = "07edbedc4ab0139e77837ecd092064c259144c8b09e29458e91391c812e178546b356f2b9ff7e8f92858734ef62e5c31496e794fdb38f954bda0153bfe05e6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-forked \
python39-pytest-forked \
python3dist-pytest-forked"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest"

inherit rpm
