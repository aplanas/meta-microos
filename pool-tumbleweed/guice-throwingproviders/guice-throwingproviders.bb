SUMMARY = "ThrowingProviders extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides ThrowingProviders module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-throwingproviders-5.1.0-1.2.noarch.rpm"
RPM_HASH = "345b551dccd9b26d35c3da2a23eddaefcf755ded1e2ccb8034bc470e1b2bf97f722a58f47ba59531cc48c0918da2392c3a758102954ff8c434e32ddffac4ebb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-throwingproviders \
mvn-com.google.inject.extensions-guice-throwingproviders \
mvn-com.google.inject.extensions-guice-throwingproviders-pom- \
mvn-org.sonatype.sisu.inject-guice-throwingproviders \
mvn-org.sonatype.sisu.inject-guice-throwingproviders-pom- \
osgi-com.google.inject.throwingproviders"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.truth-truth"

inherit rpm
