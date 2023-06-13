SUMMARY = "Server-side API for handling HTTP requests and responses"
DESCRIPTION = "Jakarta Servlet defines a server-side API for handling HTTP requests \
and responses."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0)"

PV = "5.0.0"

RPM_NAME = "jakarta-servlet-5.0.0-1.7.noarch.rpm"
RPM_HASH = "26ad5fa7aecae489b5a10614fe846bc5f151b157bb54acb9efd1f49d4196128485ef47394f6d7630d0b9cb5b9ca03a75907c81e56320265e57c2a0b87f48dd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-servlet \
mvn(jakarta.servlet:jakarta.servlet-api) \
mvn(jakarta.servlet:jakarta.servlet-api:pom:) \
osgi(jakarta.servlet-api)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
