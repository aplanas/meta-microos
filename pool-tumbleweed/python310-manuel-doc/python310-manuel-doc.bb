SUMMARY = "Build tested documentation"
DESCRIPTION = "This package contains documentation files for python310-manuel."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python310-manuel-doc-1.12.4-4.2.noarch.rpm"
RPM_HASH = "6428a06c603482d646310996ad585a8de99d705020e5baab67d94b34fa42ad7e189c4ca20eb500be8159fbe25b8f08db6332a00d1790d9a5d8e35257522034cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-manuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
