SUMMARY = "Grapher extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Grapher module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-grapher-5.1.0-1.1.noarch.rpm"
RPM_HASH = "9227883f8e88cd0bcc6a6343f638e03ec77a3b27c550aba936ec6f164e048fe3acbea0f159d50107dc972938876a24abd190c1f263409117145aef29aa027091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-grapher \
mvn(com.google.inject.extensions:guice-grapher) \
mvn(com.google.inject.extensions:guice-grapher:pom:) \
mvn(org.sonatype.sisu.inject:guice-grapher) \
mvn(org.sonatype.sisu.inject:guice-grapher:pom:) \
osgi(com.google.inject.grapher)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.inject.extensions:guice-assistedinject)"

inherit rpm
