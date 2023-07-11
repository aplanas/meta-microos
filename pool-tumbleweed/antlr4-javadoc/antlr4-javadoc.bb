SUMMARY = "API documentation for antlr4"
DESCRIPTION = "This package contains API documentation for antlr4."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-javadoc-4.13.0-1.2.noarch.rpm"
RPM_HASH = "f995fd39af9990f212aa621d131493816fe3fc17655aac5a7a66d76999303f2ec75adf4bdf54e19d3c92e93ddb2bb032a4a1b4c80e8cdd171715089030f7d831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
