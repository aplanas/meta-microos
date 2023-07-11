SUMMARY = "API Documentation for sbt-launcher"
DESCRIPTION = "JavaDoc documentation for sbt-launcher"
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "sbt-launcher-javadoc-1.1.2-2.10.noarch.rpm"
RPM_HASH = "33ebee0f8369bbaf53ef7b8ce22244fc41bcb10a1231d2bbdceb4452afdd341c90775fd76344163b6330e14945711eb462d218b692f01a095f65877b83560bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sbt-launcher-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
