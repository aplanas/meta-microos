SUMMARY = "Grapher extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Grapher module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-grapher-5.1.0-1.2.noarch.rpm"
RPM_HASH = "5563cf610c0c6e15fb57e91e7b7567cf6ecf3b223324c63caeb1335b45b75c89de674ea675b26f5f5650efde85c1eaae6c796d76b3270de6bd422772fedd4666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-grapher \
mvn-com.google.inject.extensions-guice-grapher \
mvn-com.google.inject.extensions-guice-grapher-pom- \
mvn-org.sonatype.sisu.inject-guice-grapher \
mvn-org.sonatype.sisu.inject-guice-grapher-pom- \
osgi-com.google.inject.grapher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.inject.extensions-guice-assistedinject"

inherit rpm
