SUMMARY = "A JSON StAX implementation"
DESCRIPTION = "Jettison is a collection of Java APIs (like STaX and DOM) which read \
and write JSON. This allows nearly transparent enablement of JSON based \
web services in services frameworks like CXF or XML serialization \
frameworks like XStream."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-1.5.4-1.1.noarch.rpm"
RPM_HASH = "e1e51df4ed140ae344bfcb2db1d9b09b2955acbae9d64d80a8f8408a74f0326d69fbd2b4476851a2adff7e54bed7fadc1747f9453188b92bc4192e4fe430b1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison \
mvn(org.codehaus.jettison:jettison) \
mvn(org.codehaus.jettison:jettison:pom:) \
osgi(org.codehaus.jettison.jettison)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
