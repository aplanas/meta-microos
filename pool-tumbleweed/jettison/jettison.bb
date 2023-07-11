SUMMARY = "A JSON StAX implementation"
DESCRIPTION = "Jettison is a collection of Java APIs (like STaX and DOM) which read \
and write JSON. This allows nearly transparent enablement of JSON based \
web services in services frameworks like CXF or XML serialization \
frameworks like XStream."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-1.5.4-1.2.noarch.rpm"
RPM_HASH = "298c25a146fd42e61818f80ba3ba8b7463fb39a53509bf003110e0006a3cf7c133271552ab7953932a4fcca2e9bde5f7e7ae6d7a1312d71bff2c8e002fa0f66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison \
mvn-org.codehaus.jettison-jettison \
mvn-org.codehaus.jettison-jettison-pom- \
osgi-org.codehaus.jettison.jettison"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
