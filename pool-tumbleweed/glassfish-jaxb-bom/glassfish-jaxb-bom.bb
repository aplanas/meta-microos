SUMMARY = "JAXB BOM"
DESCRIPTION = "JAXB Bill of Materials (BOM)"
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-bom-2.3.1-4.5.noarch.rpm"
RPM_HASH = "999279ace73b023fc6232203e49f3307b4bd3eb1df65b6ae9176784dda30e8d2716e2516569a0a5b7b07e10bc069f95f13f8c3f2a4083aab2280f37ffb4740d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-bom \
mvn-org.glassfish.jaxb-jaxb-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.java-jvnet-parent-pom-"

inherit rpm
