SUMMARY = "PyUnit-based test runner with JUnit like XML reporting"
DESCRIPTION = "unittest-xml-reporting is a unittest test runner that can save test results \
to XML files that can be consumed by a wide range of tools, such as build \
systems, IDEs and continuous integration servers."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.2"

RPM_NAME = "python311-unittest-xml-reporting-3.0.2-3.2.noarch.rpm"
RPM_HASH = "8396c9bdf1a56e8a3e2b8a6529a19b242c85c6056d3ea9c4d6ee65fab7053944884c9a8dca058e0013fa6f2a7b4456f7b8fa04d13ba449d405195968f03e343d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unittest-xml-reporting) \
python311-unittest-xml-reporting \
python311-xmlrunner \
python3dist(unittest-xml-reporting)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
