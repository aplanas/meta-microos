SUMMARY = "Pytest plugin for detecting inadvertent open file handles"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to detect whether any file handles or other file-like objects were \
inadvertently left open at the end of a unit test."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-pytest-openfiles-0.5.0-1.13.noarch.rpm"
RPM_HASH = "e7bd4005175d1c0704a5517bff902ac43b537bdd9d0f27c4fd40df14db0c3925551cdf986094592094b417e53677cf33da6988532e8841f3b09d0fbc2cf391ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-openfiles \
python311-pytest-openfiles \
python3dist-pytest-openfiles"

RDEPENDS:${PN} += "python-abi \
python311-psutil \
python311-pytest"

inherit rpm
