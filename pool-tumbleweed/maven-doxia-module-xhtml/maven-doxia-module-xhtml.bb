SUMMARY = "XHTML module for maven-doxia"
DESCRIPTION = "This package provides XHTML module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-xhtml-1.9.1-6.7.noarch.rpm"
RPM_HASH = "12451d03be1cba351667d3d51eea8c886be805d54e932356f1b8f9995bf58f0993ba1903845166411f334e3e02bbbe52b76eddf4d2843c2dfe6c1d6851443967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xhtml \
mvn(org.apache.maven.doxia:doxia-module-xhtml) \
mvn(org.apache.maven.doxia:doxia-module-xhtml:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
