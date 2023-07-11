SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-testscenarios-0.5.0-5.3.noarch.rpm"
RPM_HASH = "658bdd7e6c56f889829446a6f25fa427819718ac7e01d7626bb66baef08b1de462493e4c60663f598bd1e9f23bc0ef55d3c5aab5f85261b034af82ee5f2e5f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testscenarios \
python39-testscenarios \
python3dist-testscenarios"

RDEPENDS:${PN} += "python-abi \
python39-pbr \
python39-testtools"

inherit rpm
