SUMMARY = "A JSON StAX implementation"
DESCRIPTION = "Jettison is a collection of Java APIs (like STaX and DOM) which read \
and write JSON. This allows nearly transparent enablement of JSON based \
web services in services frameworks like CXF or XML serialization \
frameworks like XStream."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-1.5.4-2.1.noarch.rpm"
RPM_HASH = "cd59babd140ed2a95651ee2c459e193b265a733003233fa0967d8cb4085138e4e7258e47afeec9632ccd9c3a3687471dd221d186b4451b2d14d044b112e6595f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison \
mvn-org.codehaus.jettison-jettison \
mvn-org.codehaus.jettison-jettison-pom- \
osgi-org.codehaus.jettison.jettison"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
