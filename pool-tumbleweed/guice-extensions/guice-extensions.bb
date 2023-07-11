SUMMARY = "Extensions for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides extensions POM for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-extensions-5.1.0-1.2.noarch.rpm"
RPM_HASH = "986351d797a568b97fabb8e90337f40dc35caca069d5ca17f989d75572dc417d3f378573ad467b5a9623a3bd674342c6173529cad473edd67140eb21dac5920d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-extensions \
mvn-com.google.inject.extensions-extensions-parent-pom- \
mvn-org.sonatype.sisu.inject-extensions-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
