SUMMARY = "Parent pom for Apache Logging Services projects"
DESCRIPTION = "Parent pom for Apache Logging Services projects."
LICENSE = "Apache-2.0"

PV = "5"

RPM_NAME = "apache-logging-parent-5-1.5.noarch.rpm"
RPM_HASH = "965ce66236fc4d589be776c8cbe16a297e1f410cdd7d9b2b3d281e30365499a4b8289a7e9b0fa45e98b400de5f315fed8087f42a4b0025da8bb940965e3a2ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-logging-parent \
mvn(org.apache.logging:logging-parent:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache:apache:pom:)"

inherit rpm
