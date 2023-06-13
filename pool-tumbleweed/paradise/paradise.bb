SUMMARY = "Macros for Scala"
DESCRIPTION = "Empowers production Scala compiler with latest macro developments"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "paradise-2.1.0-2.9.aarch64.rpm"
RPM_HASH = "15ae3855f13d856ec02e86232a99d3a368a28534496d3b3414cec824c53f06e2f563ac193c3078a4a69f078b1cfff937dd959ff138d809588791bb260973f347"

RPROVIDES:${PN} += "mvn(org.scalamacros:paradise_2.10.7) \
mvn(org.scalamacros:paradise_2.10.7:pom:) \
paradise \
paradise(aarch-64)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.scala-lang:scala-library) \
mvn(org.scalamacros:quasiquotes_2.10)"

inherit rpm
