SUMMARY = "A hybrid functional/object-oriented language for the JVM"
DESCRIPTION = "Scala is a general purpose programming language designed to express \
common programming patterns in a concise and type-safe way. It \
integrates features of object-oriented and functional languages. It \
is also interoperable with Java."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "scala-2.10.7-8.9.aarch64.rpm"
RPM_HASH = "5ad76838b9a235a8028862899e44e35bcbd6d37f3594d2bc012b0d1261995aecb1b512bf931a6fab35f2587af6a8f757b19c843a04e7706c4a0fe798f80fb9b5"

RPROVIDES:${PN} += "mvn-org.scala-lang-scala-compiler \
mvn-org.scala-lang-scala-compiler-pom- \
mvn-org.scala-lang-scala-library \
mvn-org.scala-lang-scala-library-pom- \
mvn-org.scala-lang-scala-reflect \
mvn-org.scala-lang-scala-reflect-pom- \
mvn-org.scala-lang-scalap \
mvn-org.scala-lang-scalap-pom- \
osgi-org.scala-ide.scala.compiler \
osgi-org.scala-ide.scala.library \
scala \
scala-bootstrap"

RDEPENDS:${PN} += "/usr/bin/env \
jansi \
java-headless \
javapackages-filesystem \
javapackages-tools \
jline"

inherit rpm
