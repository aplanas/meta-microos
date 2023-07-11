SUMMARY = "Scalable real-time transaction processing"
DESCRIPTION = "Akka is a toolkit and run-time for building highly concurrent, \
distributed, and fault tolerant event-driven applications on \
the JVM."
LICENSE = "Apache-2.0"

PV = "2.3.16"

RPM_NAME = "akka-2.3.16-8.10.noarch.rpm"
RPM_HASH = "e3406bd954bf9e999fe1f39127611f3efa7122492a7ec3668336337aabc08bd8e07aa7c7888fd6782645c335aaca35ba918a2950052a8acf38b81baef09cbd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akka \
mvn-com.typesafe.akka-akka-actor-2.10 \
mvn-com.typesafe.akka-akka-actor-2.10-pom- \
mvn-com.typesafe.akka-akka-agent-2.10 \
mvn-com.typesafe.akka-akka-agent-2.10-pom- \
mvn-com.typesafe.akka-akka-cluster-2.10 \
mvn-com.typesafe.akka-akka-cluster-2.10-pom- \
mvn-com.typesafe.akka-akka-dataflow-2.10 \
mvn-com.typesafe.akka-akka-dataflow-2.10-pom- \
mvn-com.typesafe.akka-akka-kernel-2.10 \
mvn-com.typesafe.akka-akka-kernel-2.10-pom- \
mvn-com.typesafe.akka-akka-osgi-2.10 \
mvn-com.typesafe.akka-akka-osgi-2.10-pom- \
mvn-com.typesafe.akka-akka-remote-2.10 \
mvn-com.typesafe.akka-akka-remote-2.10-pom- \
mvn-com.typesafe.akka-akka-slf4j-2.10 \
mvn-com.typesafe.akka-akka-slf4j-2.10-pom- \
mvn-com.typesafe.akka-akka-transactor-2.10 \
mvn-com.typesafe.akka-akka-transactor-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.protobuf-protobuf-java \
mvn-com.typesafe-config \
mvn-io.netty-netty \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core \
mvn-org.scala-lang-scala-library \
mvn-org.scala-stm-scala-stm-2.10 \
mvn-org.slf4j-slf4j-api \
mvn-org.uncommons.maths-uncommons-maths"

inherit rpm
