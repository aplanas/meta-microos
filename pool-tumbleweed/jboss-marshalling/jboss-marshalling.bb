SUMMARY = "JBoss Marshalling"
DESCRIPTION = "JBoss Marshalling is an alternative serialization API that fixes many \
of the problems found in the JDK serialization API while remaining \
fully compatible with java.io.Serializable and its relatives, and adds \
several new tunable parameters and additional features, all of which \
are pluggable via factory configuration (externalizers, class/instance \
lookup tables, class resolution, and object replacement, to name a \
few)."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-1.4.11-1.21.noarch.rpm"
RPM_HASH = "141e2951a39842e7ecfe4a2535eebc7dc3cc3752ff1cccd92fc659cdfdad83f35e227728807ac1b8a064327deffa344576b4912fc35a6f5a19b02e7a7727e06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling \
mvn-org.jboss.marshalling-jboss-marshalling \
mvn-org.jboss.marshalling-jboss-marshalling-parent-pom- \
mvn-org.jboss.marshalling-jboss-marshalling-pom- \
mvn-org.jboss.marshalling-jboss-marshalling-river \
mvn-org.jboss.marshalling-jboss-marshalling-river-pom- \
mvn-org.jboss.marshalling-jboss-marshalling-serial \
mvn-org.jboss.marshalling-jboss-marshalling-serial-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
