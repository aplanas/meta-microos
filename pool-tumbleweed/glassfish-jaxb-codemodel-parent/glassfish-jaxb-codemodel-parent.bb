SUMMARY = "Codemodel parent POM"
DESCRIPTION = "This package contains codemodel parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-parent-2.3.1-4.4.noarch.rpm"
RPM_HASH = "65901a598d68c961508acdad658ee2954725554d42f77992b5c01ad3666ef09697fb216ca54d8d17e107db77aeea7f00c864a0ae492e1b0892a06bf073b6405b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel-parent \
mvn-com.sun.xml.bind.mvn-jaxb-codemodel-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
