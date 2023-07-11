SUMMARY = "Notation to manipulate Scala syntax trees"
DESCRIPTION = "Quasiquotes are a notation that allows to manipulate Scala syntax trees."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "quasiquotes-2.1.0-2.10.aarch64.rpm"
RPM_HASH = "5908b3c3276ea78488d55d271294dd4aa98e8fb01c7be8ff59b87ce68b53b12d090b6326e6e91239cf99c6b0a928af87af3fe3b0e655f5ee2d38b7c9a143df55"

RPROVIDES:${PN} += "mvn-org.scalamacros-quasiquotes-2.10 \
mvn-org.scalamacros-quasiquotes-2.10-pom- \
quasiquotes"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library \
mvn-org.scala-lang-scala-reflect"

inherit rpm
