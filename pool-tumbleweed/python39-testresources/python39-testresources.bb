SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python39-testresources-2.0.1-7.1.noarch.rpm"
RPM_HASH = "d2fcc4bdf98ec45aba59e7b8b4dc1e8d58a2574d264a2759dd5b67435f6a805e4405040ebb6db2123d7fd5a139f8ee152cb0bd328a9b394afb6cb6cb1bc31f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(testresources) \
python39-testresources \
python3dist(testresources)"
RDEPENDS:${PN} += "python(abi) \
python39-pbr"

inherit rpm
