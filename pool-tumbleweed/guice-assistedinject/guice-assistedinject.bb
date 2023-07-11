SUMMARY = "AssistedInject extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides AssistedInject module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-assistedinject-5.1.0-1.2.noarch.rpm"
RPM_HASH = "8af43472eac1d727a6be0a29d2aa9edb68ae4a4c2aade93ec536eb801e811540b511cffec27b3a6825ae3d5f9a0f4ac1ff45acab823400845e15c0995ebb04aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-assistedinject \
mvn-com.google.inject.extensions-guice-assistedinject \
mvn-com.google.inject.extensions-guice-assistedinject-pom- \
mvn-org.sonatype.sisu.inject-guice-assistedinject \
mvn-org.sonatype.sisu.inject-guice-assistedinject-pom- \
osgi-com.google.inject.assistedinject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.truth-truth"

inherit rpm
