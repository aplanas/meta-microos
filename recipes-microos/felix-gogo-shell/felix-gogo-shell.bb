SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package provides a simple textual user interface to interact with the \
command processor."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "felix-gogo-shell-1.1.4-1.3.noarch.rpm"
RPM_HASH = "a2538bffd7b4507ae4bab75800e12cb53f6e5510595476743a1ff4c4da95108a7cf540f64ef68561d3862312ee5abd993e798d15e2ca3c79a56f8b2b9e319283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-shell \
mvn(org.apache.felix:org.apache.felix.gogo.shell) \
mvn(org.apache.felix:org.apache.felix.gogo.shell:pom:) \
osgi(org.apache.felix.gogo.shell)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.felix:org.apache.felix.gogo.runtime) \
mvn(org.osgi:osgi.annotation)"

inherit rpm
