SUMMARY = "Software Transactional Memory for Scala"
DESCRIPTION = "ScalaSTM is a lightweight software transactional memory \
for Scala, inspired by the STMs in Haskell and Clojure. \
 \
ScalaSTM provides a mutable cell called a Ref. If you \
build a shared data structure using immutable objects and \
Ref-s, then you can access it from multiple threads or \
actors. No synchronized, no deadlocks or race conditions, \
and good scalability. Included are concurrent sets and \
maps, and we also have an easier and safer replacement \
for wait and notifyAll."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "scala-stm-0.7-2.11.noarch.rpm"
RPM_HASH = "eb7a2fbfe68f2aeeb92925f8ad5b64079121c5fa69c93465aa38eea101a0a8808100cb1b8ece4eeed917610b8bc25c003c7baab966402145658858496138419c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-stm-scala-stm-2.10 \
mvn-org.scala-stm-scala-stm-2.10-pom- \
scala-stm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
