SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python310-pytest-trio-0.8.0-2.1.noarch.rpm"
RPM_HASH = "ba728f21b8229b4abe57698d470c56b38e8d27401297fb51f4a245b4e306a68082ebe391d9328a10d409bf42dd62238a86986e278861a4b3bc0d8800e566d2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-trio \
python3.10dist(pytest-trio) \
python310-pytest-trio \
python3dist(pytest-trio)"

RDEPENDS:${PN} += "python(abi) \
python310-contextvars \
python310-outcome \
python310-pytest \
python310-trio"

inherit rpm
