SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python311-pytest-trio-0.8.0-2.1.noarch.rpm"
RPM_HASH = "6b9cb3b0f13ce258ef2a593e1d95097d1ff5b444f52d68e8c4694c95249756e70f5a7ddd7fb4d91ab9c04f3fefa7af814fd7b564a7de06c81585c9f80b331c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-trio \
python311-pytest-trio \
python3dist-pytest-trio"

RDEPENDS:${PN} += "python-abi \
python311-contextvars \
python311-outcome \
python311-pytest \
python311-trio"

inherit rpm
