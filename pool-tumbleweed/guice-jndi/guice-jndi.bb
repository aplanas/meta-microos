SUMMARY = "JNDI extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides JNDI module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-jndi-5.1.0-1.2.noarch.rpm"
RPM_HASH = "6c04f6b04b66b27b7e09f61ccff652e4b9b322ebbf67a8043534dcd6b0201d1bc7b8e0b8a0425f295101b1632e633a56951f8a29606bf96e447e0668eaff2861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-jndi \
mvn-com.google.inject.extensions-guice-jndi \
mvn-com.google.inject.extensions-guice-jndi-pom- \
mvn-org.sonatype.sisu.inject-guice-jndi \
mvn-org.sonatype.sisu.inject-guice-jndi-pom- \
osgi-com.google.inject.jndi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
