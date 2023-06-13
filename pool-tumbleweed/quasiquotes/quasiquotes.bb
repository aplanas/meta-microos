SUMMARY = "Notation to manipulate Scala syntax trees"
DESCRIPTION = "Quasiquotes are a notation that allows to manipulate Scala syntax trees."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "quasiquotes-2.1.0-2.9.aarch64.rpm"
RPM_HASH = "121f1737919b380b7d9fb8a8d44de14b4e6c14c3fd74428b7f82be867ba480c9cae8828eff6c5f20465173252bcf206523b0ce5c3fbfcd5e6b03e153dddc0252"

RPROVIDES:${PN} += "mvn(org.scalamacros:quasiquotes_2.10) \
mvn(org.scalamacros:quasiquotes_2.10:pom:) \
quasiquotes \
quasiquotes(aarch-64)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.scala-lang:scala-library) \
mvn(org.scala-lang:scala-reflect)"

inherit rpm
