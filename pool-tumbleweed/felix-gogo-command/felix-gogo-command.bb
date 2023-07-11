SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package implements a set of basic commands."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-1.1.2-1.4.noarch.rpm"
RPM_HASH = "abf45862ef5f1f3d518f7548d3aa5ef33fb675bb40bab8e79a17175d567a11517a208df55ff7e901095b342357c114ec6c6b2bff5f90c1c4e36c3a6ffeceb803"
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
