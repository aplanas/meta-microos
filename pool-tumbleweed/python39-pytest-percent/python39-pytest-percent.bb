SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-pytest-percent-0.1.2-1.12.noarch.rpm"
RPM_HASH = "a6c8f08ffada4d96c71363ce7a233e147ce2450a4c5ef6182450426dc6fbc5503116c7f413976b9b5f814378bcd7fd933d36394cd92d00af1d1f05a5eadda34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-percent) \
python39-pytest-percent \
python3dist(pytest-percent)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
