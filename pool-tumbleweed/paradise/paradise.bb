SUMMARY = "Macros for Scala"
DESCRIPTION = "Empowers production Scala compiler with latest macro developments"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "paradise-2.1.0-2.10.aarch64.rpm"
RPM_HASH = "ad3c6f304fd4e1e4015c6348e1169a5be0ca76ad6244181ac8aa5238d6b032ff76fc4b82107d3b6fcc765ae08d57ff49c62c05f3de8ea5c79b9a14efd39b47f1"

RPROVIDES:${PN} += "mvn-org.scalamacros-paradise-2.10.7 \
mvn-org.scalamacros-paradise-2.10.7-pom- \
paradise"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library \
mvn-org.scalamacros-quasiquotes-2.10"

inherit rpm
