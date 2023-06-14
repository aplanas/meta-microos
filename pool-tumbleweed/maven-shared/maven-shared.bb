SUMMARY = "Maven Shared Components"
DESCRIPTION = "Maven Shared Components"
LICENSE = "Apache-2.0"

PV = "22"

RPM_NAME = "maven-shared-22-1.11.noarch.rpm"
RPM_HASH = "5ae699c429727a58bb00f001f2606f18135990bf97e2406f986c86c104cc78f69c29f21224c1049fd8d8f28b002ce552598c22adeed48fe4869a49f2ba819dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared \
mvn-org.apache.maven.shared-maven-shared-components-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-parent-pom-"

inherit rpm
