SUMMARY = "Documentation for the cppunit API"
DESCRIPTION = "This package contains documentation for the cppunit API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "cppunit-devel-doc-1.15.1-1.13.noarch.rpm"
RPM_HASH = "d179dd57c6cbc228a2af3e0f05a9727868f24355e0be375af17c7e79b323d6eb94ad5d04a543697b0ac882c0d7e3ce130c4bf0577967ede9eff0d2ed71c0fc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppunit-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
