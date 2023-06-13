SUMMARY = "JNDI extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides JNDI module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-jndi-5.1.0-1.1.noarch.rpm"
RPM_HASH = "45109a28dd93e548208c9d283932605961e1945e9e99531476f383046591ff298247f1a8fc76495718b77b7e615597bd43e86ae88ba40f7586d3652b716469c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-jndi \
mvn(com.google.inject.extensions:guice-jndi) \
mvn(com.google.inject.extensions:guice-jndi:pom:) \
mvn(org.sonatype.sisu.inject:guice-jndi) \
mvn(org.sonatype.sisu.inject:guice-jndi:pom:) \
osgi(com.google.inject.jndi)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
