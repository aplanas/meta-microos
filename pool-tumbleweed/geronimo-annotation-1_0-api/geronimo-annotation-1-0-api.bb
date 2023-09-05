SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-annotation-1_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "c95759dfe4639f014907c8fa6e3e4061b4030a278b871d261dfbc22435a816106deee31219536a7f77cb17e36ec2589cdef417007bc563e7994dc1ee92ffaf3a"
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
