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

RPM_NAME = "scala-stm-0.7-2.12.noarch.rpm"
RPM_HASH = "aba4e4bce32be2321fd4e46f1fa4390afd847c676aaf23a87fa83918ecffb9cf4d517392f1d7b399bc1d59bf25515e2a6a3093384a29ce68e67fa0d3bdb7cf3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-stm-scala-stm-2.10 \
mvn-org.scala-stm-scala-stm-2.10-pom- \
scala-stm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
