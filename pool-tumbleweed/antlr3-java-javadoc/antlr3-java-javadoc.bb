SUMMARY = "API documentation for antlr3-java"
DESCRIPTION = "API documentation for antlr3-java."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-java-javadoc-3.5.3-2.3.noarch.rpm"
RPM_HASH = "3545f7e4bcf7e75cd0f1db03f5cf23c74d6fbeb4a366a138cdca094d2c5214aed243230a737c03f3e356d3a410730407982c7a596553fe79628a6308d3e64d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-java-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
