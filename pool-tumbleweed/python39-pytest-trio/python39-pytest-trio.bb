SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python39-pytest-trio-0.8.0-2.3.noarch.rpm"
RPM_HASH = "573d1bdf7899e27c46ce7abdc9814bc9d79a7a83968fba11255cb7a1184fd7344710d02b3194c143901617fea3abec9fffe943ada3ad80fceae9d0af2c93caab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-trio \
python39-pytest-trio \
python3dist-pytest-trio"

RDEPENDS:${PN} += "python-abi \
python39-contextvars \
python39-outcome \
python39-pytest \
python39-trio"

inherit rpm
