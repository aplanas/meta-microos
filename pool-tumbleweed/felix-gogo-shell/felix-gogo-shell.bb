SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package provides a simple textual user interface to interact with the \
command processor."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-1.1.4-2.1.noarch.rpm"
RPM_HASH = "354a7881a5b0c9eba061876e3c119c8f45dca9d7cb071194b9e1b30657be9ee2d428719b121ddd736513a1f994857377f1ee9255948e8d7aad719194d34532a6"
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
