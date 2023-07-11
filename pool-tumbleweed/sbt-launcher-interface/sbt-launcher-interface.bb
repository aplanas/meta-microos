SUMMARY = "Launcher Interface"
DESCRIPTION = "Interfaces for launching projects with the sbt launcher"
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "sbt-launcher-interface-1.1.2-2.10.noarch.rpm"
RPM_HASH = "244249d0517cfa25bfd6d8fb66a0976ec2b0aa2ecd8a2020050d184c78fa1fc9a314b4da0d9aa17cd09f7c6f8ff170bb5a57d2c9880a6786d28093436e8cffde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-launcher-interface \
mvn-org.scala-sbt-launcher-interface-pom- \
sbt-launcher-interface"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
