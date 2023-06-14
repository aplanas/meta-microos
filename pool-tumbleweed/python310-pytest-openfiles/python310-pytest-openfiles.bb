SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-pytest-openfiles-0.5.0-1.13.noarch.rpm"
RPM_HASH = "bea0aebb21fae5bd96a389de007b784c03ea1cfcd23122c94310e286cb2744adfa9ae411fb469852d7805bf3cc2a5b119552ee16f8ff5e988ba65e8746205e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-openfiles \
python3.10dist-pytest-openfiles \
python310-pytest-openfiles \
python3dist-pytest-openfiles"

RDEPENDS:${PN} += "python-abi \
python310-psutil \
python310-pytest"

inherit rpm
