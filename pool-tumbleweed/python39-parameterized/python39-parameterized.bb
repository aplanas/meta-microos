SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python39-parameterized-0.9.0-1.1.noarch.rpm"
RPM_HASH = "bd3e7d8e603aa4a18ac4ed602fe08ae2603bcceb542bd71aa80776815881cbc2203ec53efc704e4e64fd57050d8b156979c407901378d22b24bbab5e2f9fc942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parameterized) \
python39-parameterized \
python3dist(parameterized)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
