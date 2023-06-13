SUMMARY = "Documentation for squirrel"
DESCRIPTION = "Documentation files for squirrel."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-doc-3.2-2.2.noarch.rpm"
RPM_HASH = "8c659043d8b63556f8cf400fe2b044abeb38edbdf31a3ec4f3927264b161cdb75b88d3b195e98f164ab0f85bb3f4af633176225544821e722e7222d762b0e01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "squirrel-doc"

RDEPENDS:${PN} += ""

inherit rpm
