SUMMARY = "XML Schemas for Jetty"
DESCRIPTION = "XML Schemas for Jetty."
LICENSE = "(Apache-2.0 | EPL-1.0) & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "4.0.3"

RPM_NAME = "jetty-schemas-4.0.3-1.21.noarch.rpm"
RPM_HASH = "11d2f100f12ca0d69515eca68738680ffe2f958a1ad3bce02e6abbaf97c6b6e4184f63d7d619a808a0e97c8679923448bf9e3067350ae82702476c59072760f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-schemas \
mvn-org.eclipse.jetty.toolchain-jetty-schemas \
mvn-org.eclipse.jetty.toolchain-jetty-schemas-pom- \
osgi-org.eclipse.jetty.schemas"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
