SUMMARY = "Server-side API for handling HTTP requests and responses"
DESCRIPTION = "Jakarta Servlet defines a server-side API for handling HTTP requests \
and responses."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "5.0.0"

RPM_NAME = "jakarta-servlet-5.0.0-1.8.noarch.rpm"
RPM_HASH = "df545fade844627f38f37b717ce415f855e2ca443afc89bbed1d028474f963c95ff34557a06c4dd2ec46e47eec38cc7f2b0362e12e1c31e444e89f54e15f68ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-servlet \
mvn-jakarta.servlet-jakarta.servlet-api \
mvn-jakarta.servlet-jakarta.servlet-api-pom- \
osgi-jakarta.servlet-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
