SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python310-testresources-2.0.1-7.1.noarch.rpm"
RPM_HASH = "4749b7bf95952c3e489b7692b56d671d20916116f6df834b1a2ae1d0adda0da6301b9b2084eca86c566772e26ba160655b20f5a1734b71a73baac89266509ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testresources \
python3.10dist(testresources) \
python310-testresources \
python3dist(testresources)"

RDEPENDS:${PN} += "python(abi) \
python310-pbr"

inherit rpm
