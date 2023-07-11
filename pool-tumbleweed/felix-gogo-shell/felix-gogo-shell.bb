SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package provides a simple textual user interface to interact with the \
command processor."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-1.1.4-1.4.noarch.rpm"
RPM_HASH = "13a835737315b06f2a5703a02f92b422be7a0572a05f246900bb4f1ed95e86a8ebc1241127491a3354e3ae3879e226e5ab32382aeb1db88d7150b47a9e30e9f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-shell \
mvn-org.apache.felix-org.apache.felix.gogo.shell \
mvn-org.apache.felix-org.apache.felix.gogo.shell-pom- \
osgi-org.apache.felix.gogo.shell"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-org.apache.felix.gogo.runtime \
mvn-org.osgi-osgi.annotation"

inherit rpm
