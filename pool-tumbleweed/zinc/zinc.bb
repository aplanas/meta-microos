SUMMARY = "Incremental scala compiler"
DESCRIPTION = "Zinc is a stand-alone version of sbt's incremental compiler."
LICENSE = "Apache-2.0"

PV = "0.3.15"

RPM_NAME = "zinc-0.3.15-3.12.noarch.rpm"
RPM_HASH = "b5b0ad266c7c05aa785902d420e957e7ec3115a46adedeb8ad20c2ae5784406b2ba20fe96998a09fb34fb79ffad13a99ac4b077a392b48bbab6fc00782177efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.typesafe.zinc-zinc \
mvn-com.typesafe.zinc-zinc-pom- \
zinc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library \
mvn-org.scala-sbt-incremental-compiler \
sbt"

inherit rpm
