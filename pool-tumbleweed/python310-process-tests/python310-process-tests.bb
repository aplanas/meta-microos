SUMMARY = "Tools for testing processes"
DESCRIPTION = "Testcase classes and assertions for testing processes."
LICENSE = "BSD-2-Clause"

PV = "2.1.2"

RPM_NAME = "python310-process-tests-2.1.2-2.2.noarch.rpm"
RPM_HASH = "7bdf21b2a8dbd14855fde2fe6a1c994bcbfd0ffb6a78e86b4756642eb2a9a38929c5fa0a4525c9ee5467a2a0f19386283b37c2e28856818fe1c303b2627b872b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-process-tests \
python310-process-tests \
python3dist-process-tests"

RDEPENDS:${PN} += "python-abi"

inherit rpm
