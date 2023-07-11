SUMMARY = "Launcher Implementation"
DESCRIPTION = "Standalone launcher for maven/ivy deployed projects."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "sbt-launcher-1.1.2-2.10.noarch.rpm"
RPM_HASH = "82903e2250b6e45aae9683e5c18df5a1ed7eb8ad017d4313a6afdf4402ba64d9bfab80d5983b061a7993982ad52d9ef8651dd4ce3b79426d3c31a2888fe9b2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-launcher-implementation \
mvn-org.scala-sbt-launcher-implementation-pom- \
sbt-launcher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ivy-ivy \
mvn-org.scala-lang-scala-library \
mvn-org.scala-sbt-launcher-interface"

inherit rpm
