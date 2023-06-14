SUMMARY = "Scalable real-time transaction processing"
DESCRIPTION = "Akka is a toolkit and run-time for building highly concurrent, \
distributed, and fault tolerant event-driven applications on \
the JVM."
LICENSE = "Apache-2.0"

PV = "2.3.16"

RPM_NAME = "akka-2.3.16-8.9.noarch.rpm"
RPM_HASH = "517d006732c6f2d0c197dbc9026463dd71852c60c248584d9125ad2056bcdfd7c6c15f4cd20e9b3734bf61ffea9b393f547fcdb883ac8dddfb8a005f49b9a2ea"
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
