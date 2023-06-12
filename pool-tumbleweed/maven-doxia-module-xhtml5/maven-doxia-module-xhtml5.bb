SUMMARY = "XHTML5 module for maven-doxia"
DESCRIPTION = "This package provides XHTML5 module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-xhtml5-1.9.1-6.7.noarch.rpm"
RPM_HASH = "a273fe833e68fa2585e1fb25f86a462175295f1f90402ce555aafb31784015b1751275d4eba45cd8a74d3f8064363164d20bb4ea9bd96935ede737692114d73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xhtml5 \
mvn(org.apache.maven.doxia:doxia-module-xhtml5) \
mvn(org.apache.maven.doxia:doxia-module-xhtml5:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
