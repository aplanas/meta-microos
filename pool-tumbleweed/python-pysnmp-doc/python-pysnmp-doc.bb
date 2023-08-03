SUMMARY = "PySNMP documentation"
DESCRIPTION = "PySNMP documentation and examples."
LICENSE = "BSD-2-Clause"

PV = "5.0.28"

RPM_NAME = "python-pysnmp-doc-5.0.28-1.1.noarch.rpm"
RPM_HASH = "abdc819a5cb814ad0e3bab7b1a407e5d900b512ec445f917c8717f29a9f620bc5180963d64606ebf1580bced3d62e0187095360ad32d8bf03aa8964cf9a5ce4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pysnmp-doc \
python310-pysnmp-doc \
python311-pysnmp-doc \
python39-pysnmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
