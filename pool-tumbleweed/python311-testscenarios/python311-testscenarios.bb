SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-testscenarios-0.5.0-5.3.noarch.rpm"
RPM_HASH = "0258e53705417e85bffc1ea7aa1ff506ceb77539d1e286492b83b549e51709a708fa14ab3ab1537e9cee3ed95fc68d47fdd57b6ab811623e68bbf5c32e42023d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testscenarios \
python3.11dist-testscenarios \
python311-testscenarios \
python3dist-testscenarios"

RDEPENDS:${PN} += "python-abi \
python311-pbr \
python311-testtools"

inherit rpm
