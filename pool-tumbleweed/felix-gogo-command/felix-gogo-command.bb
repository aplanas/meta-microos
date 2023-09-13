SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package implements a set of basic commands."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-1.1.2-2.1.noarch.rpm"
RPM_HASH = "375e693c36e616a6e853a03c1eae268bd1ebaa4448f538a07272a727f932bbe607933a810e4c70703a2ab12e2e4ea46a7701da999a1aa620d4d45d83cc6527d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-command \
mvn-org.apache.felix-org.apache.felix.gogo.command \
mvn-org.apache.felix-org.apache.felix.gogo.command-pom- \
osgi-org.apache.felix.gogo.command"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-org.apache.felix.gogo.runtime \
mvn-org.osgi-org.osgi.service.log"

inherit rpm
