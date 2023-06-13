SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers. \
 \
This package implements a set of basic commands."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "felix-gogo-command-1.1.2-1.3.noarch.rpm"
RPM_HASH = "c45646bb00ef19d5b8ce592b440163011474eb10677869c2f2c346366dea237dd5a45fe3910b1f8a8009abeea7937ec596cc6103eef6cb5b81ce13ca470a16fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-command \
mvn(org.apache.felix:org.apache.felix.gogo.command) \
mvn(org.apache.felix:org.apache.felix.gogo.command:pom:) \
osgi(org.apache.felix.gogo.command)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.felix:org.apache.felix.gogo.runtime) \
mvn(org.osgi:org.osgi.service.log)"

inherit rpm
