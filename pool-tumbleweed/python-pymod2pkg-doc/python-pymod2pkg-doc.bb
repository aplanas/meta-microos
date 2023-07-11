SUMMARY = "Documentation for python module name to package name map library"
DESCRIPTION = "Documentation for python module name to package name map library."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python-pymod2pkg-doc-0.26.0-1.11.noarch.rpm"
RPM_HASH = "71178d64b81abd763bde66df42b1bbe401c1fc8b344b678270cdc21bcd128acbbb7cca4e351cf7931253cd5d1ab8bc32e7983ae51b96826dbdde0c039cc61b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymod2pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
