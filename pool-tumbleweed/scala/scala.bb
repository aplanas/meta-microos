SUMMARY = "A hybrid functional/object-oriented language for the JVM"
DESCRIPTION = "Scala is a general purpose programming language designed to express \
common programming patterns in a concise and type-safe way. It \
integrates features of object-oriented and functional languages. It \
is also interoperable with Java."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "scala-2.10.7-8.8.aarch64.rpm"
RPM_HASH = "b7859841a4826979b44e736a0f8c201a11e45297978bc65c334bf3884a837461aae5eca691dcdda2f230bdcf08e86c343974599088557c32c72b1d38006f3133"

RPROVIDES:${PN} += "mvn(org.scala-lang:scala-compiler) \
mvn(org.scala-lang:scala-compiler:pom:) \
mvn(org.scala-lang:scala-library) \
mvn(org.scala-lang:scala-library:pom:) \
mvn(org.scala-lang:scala-reflect) \
mvn(org.scala-lang:scala-reflect:pom:) \
mvn(org.scala-lang:scalap) \
mvn(org.scala-lang:scalap:pom:) \
osgi(org.scala-ide.scala.compiler) \
osgi(org.scala-ide.scala.library) \
scala \
scala(aarch-64) \
scala-bootstrap"

RDEPENDS:${PN} += "/usr/bin/env \
jansi \
java-headless \
javapackages-filesystem \
javapackages-tools \
jline"

inherit rpm
