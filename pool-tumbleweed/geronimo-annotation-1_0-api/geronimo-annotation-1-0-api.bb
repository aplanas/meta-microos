SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-annotation-1_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "19ac869cf0121d08de8dd1804ba784e888e9f3c6cb1de9cabdb65e89856b7ce3b920c67775d09f70c40f3dbcb713af036cfee1b438ea7fc1f058bc0d45961871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "annotation-1-0-api \
annotation-api \
geronimo-annotation-1-0-api \
mvn-javax.annotation-jsr250-api \
mvn-javax.annotation-jsr250-api-pom- \
mvn-org.apache.geronimo.specs-geronimo-annotation-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-annotation-1.0-spec-pom- \
mvn-org.eclipse.jetty.orbit-javax.annotation \
mvn-org.eclipse.jetty.orbit-javax.annotation-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
