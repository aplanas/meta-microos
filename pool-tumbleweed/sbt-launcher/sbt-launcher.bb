SUMMARY = "Launcher Implementation"
DESCRIPTION = "Standalone launcher for maven/ivy deployed projects."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "sbt-launcher-1.1.2-2.9.noarch.rpm"
RPM_HASH = "eabea91e8196fa73becae9b0fcd0ad834a744cc7e365c55c87aef1f8025e16c8d74100f87daf065fe238b6415733dda305e8c656cdbc0ae60b9845a20898aaa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.scala-sbt:launcher-implementation) \
mvn(org.scala-sbt:launcher-implementation:pom:) \
sbt-launcher"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.ivy:ivy) \
mvn(org.scala-lang:scala-library) \
mvn(org.scala-sbt:launcher-interface)"

inherit rpm
