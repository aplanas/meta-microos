SUMMARY = "Scala Pickling"
DESCRIPTION = "Scala Pickling is an automatic serialization framework made for Scala. \
It's fast, boilerplate-free, and allows users to easily swap in/out \
different serialization formats (such as binary, or JSON), or even to \
provide their own custom serialization format."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "scala-pickling-0.10.1-2.9.aarch64.rpm"
RPM_HASH = "eaf9af0b47b9e73b9edd5a991bae4d0627d49c32edad996f516ff10cb7018858d6f8bd084971e6e007feddf2307d1193175303199a917a4ae7e8b63e59742428"

RPROVIDES:${PN} += "mvn(org.scala-lang.modules:scala-pickling_2.10) \
mvn(org.scala-lang.modules:scala-pickling_2.10:pom:) \
scala-pickling \
scala-pickling(aarch-64)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.scala-lang:scala-compiler) \
mvn(org.scala-lang:scala-library) \
mvn(org.scala-lang:scala-reflect) \
mvn(org.scalamacros:quasiquotes_2.10)"

inherit rpm
