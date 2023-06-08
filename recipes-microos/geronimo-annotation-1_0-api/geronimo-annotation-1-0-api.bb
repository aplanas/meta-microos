SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-annotation-1_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "76d70b233bff4f3691a9a8d87a1d5b8542d2d76b22b361f1bf7be8a61c2588f50179dd094eac580b6db0d46160e8dc6ee47035fcb1c541b7e6503cda91bb3acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "annotation_1_0_api annotation_api geronimo-annotation-1_0-api mvn(javax.annotation:jsr250-api) mvn(javax.annotation:jsr250-api:pom:) mvn(org.apache.geronimo.specs:geronimo-annotation_1.0_spec) mvn(org.apache.geronimo.specs:geronimo-annotation_1.0_spec:pom:) mvn(org.eclipse.jetty.orbit:javax.annotation) mvn(org.eclipse.jetty.orbit:javax.annotation:pom:)"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem update-alternatives"

inherit rpm
