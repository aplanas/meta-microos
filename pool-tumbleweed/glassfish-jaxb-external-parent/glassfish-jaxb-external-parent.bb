SUMMARY = "JAXB External parent POM"
DESCRIPTION = "JAXB External parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-external-parent-2.3.1-4.5.noarch.rpm"
RPM_HASH = "55a45c8365916a6e013301a699c98daadba6f34bd9fe588a859eab2acc5f034629a0df93ad3f2f17784e4d60694cf02287e5d87860628bd4165a14653108d610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-external-parent \
mvn-com.sun.xml.bind.mvn-jaxb-external-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
