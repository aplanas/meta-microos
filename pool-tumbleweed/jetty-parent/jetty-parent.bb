SUMMARY = "Jetty parent POM file"
DESCRIPTION = "Jetty parent POM file"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "25"

RPM_NAME = "jetty-parent-25-1.21.noarch.rpm"
RPM_HASH = "b432bccb0abc75a0c2950129a61e177724a9c1471933956062faf66a75415f1a6c471a03379058e52cf579cf1de2b2b086ccc5c7af2339615177c62f0a805090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-parent \
mvn-org.eclipse.jetty-jetty-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
