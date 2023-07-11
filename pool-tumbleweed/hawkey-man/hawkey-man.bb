SUMMARY = "Documentation for the hawkey Python bindings"
DESCRIPTION = "This package provides the man pages for the hawkey Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "hawkey-man-0.70.1-1.2.noarch.rpm"
RPM_HASH = "70778896e7614f4ada314c0e2c1b9e40046eb53d3fa4732a611ffceac7586312a5cfb84b9a55b271a13afdf7187791fc4ca901a8a412e4866b2e37169d7930c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawkey-man"

RDEPENDS:${PN} += ""

inherit rpm
