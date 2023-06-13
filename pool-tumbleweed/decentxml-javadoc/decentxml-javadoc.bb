SUMMARY = "API documentation for decentxml"
DESCRIPTION = "This package contains the API documentation for decentxml."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "decentxml-javadoc-1.4-4.10.noarch.rpm"
RPM_HASH = "c554430e54491c9d3b1aa57c7143322317f125b03fd9f75576d475d9126e4890e23d015cb3e7b5072d9d52040ee853f2d51c088f5b8e0c676da5754d2a2d9f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decentxml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
