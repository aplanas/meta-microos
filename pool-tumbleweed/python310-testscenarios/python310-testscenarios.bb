SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-testscenarios-0.5.0-5.3.noarch.rpm"
RPM_HASH = "f898d70048e309d9d7916140f9ce73ce20871e742a1ef7fa463694e23cba254fbd7e3d16070ff918f7bef86bb26328e1c800ee59e181192c5d07ff2414fd5115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testscenarios \
python310-testscenarios \
python3dist-testscenarios"

RDEPENDS:${PN} += "python-abi \
python310-pbr \
python310-testtools"

inherit rpm
