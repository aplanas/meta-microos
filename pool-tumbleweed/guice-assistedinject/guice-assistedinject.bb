SUMMARY = "AssistedInject extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides AssistedInject module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-assistedinject-5.1.0-1.1.noarch.rpm"
RPM_HASH = "1ed76acee63f243aab0140c8811b1a1b40f29804be1dff9a0707ba75ae9ef1cb3067d5a8d6b283f271bac00e962d1944a9ad7cccb16fc12fc24b150eb6f5e9af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-assistedinject \
mvn(com.google.inject.extensions:guice-assistedinject) \
mvn(com.google.inject.extensions:guice-assistedinject:pom:) \
mvn(org.sonatype.sisu.inject:guice-assistedinject) \
mvn(org.sonatype.sisu.inject:guice-assistedinject:pom:) \
osgi(com.google.inject.assistedinject)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.truth:truth)"

inherit rpm
