SUMMARY = "XML Schemas for Jetty"
DESCRIPTION = "XML Schemas for Jetty."
LICENSE = "(Apache-2.0 | EPL-1.0) & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "4.0.3"

RPM_NAME = "jetty-schemas-4.0.3-2.1.noarch.rpm"
RPM_HASH = "1bc54d6f2f179e21b17a3a6daab1a99fb690e1ba524de418230133c9264cf0bf0e2251d768b8bf7018153263af1fbbd84c4ffdaf538ec9c65b833c95b564aa16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-schemas \
mvn-org.eclipse.jetty.toolchain-jetty-schemas \
mvn-org.eclipse.jetty.toolchain-jetty-schemas-pom- \
osgi-org.eclipse.jetty.schemas"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
