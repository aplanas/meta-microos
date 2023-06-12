SUMMARY = "Contract API for template resolvers"
DESCRIPTION = "Contract API for template resolvers."
LICENSE = "Apache-2.0"

PV = "0.1"

RPM_NAME = "template-resolver-0.1-2.6.noarch.rpm"
RPM_HASH = "81b5d083ee9678f9240dd71294dc2ee0764f624615974449ff688256e4ba258ed3e54ad6c891f79f10e2b535466e368f59e291aa787ff07390af2215bf722aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.scala-sbt:template-resolver) \
mvn(org.scala-sbt:template-resolver:pom:) \
template-resolver"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
