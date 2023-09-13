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

RPM_NAME = "jboss-marshalling-1.4.11-2.1.noarch.rpm"
RPM_HASH = "d70525ebbfe87eefe2e98cb04d059722629f43fe8404f2b6bcc92e2d93e1857ca5a35ad78d3d1229e385d42288e0ff80a2ccaa2ea7a5a4f99ec953700a532a52"
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
