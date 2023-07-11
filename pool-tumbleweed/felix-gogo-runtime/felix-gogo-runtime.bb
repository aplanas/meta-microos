SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "felix-gogo-runtime-1.1.0-4.3.noarch.rpm"
RPM_HASH = "d736e8a9f7eabc8ce990da8bbbd7ed4f53fb33348abe733f0911b34d2165eb9c5869d06460f5501a5cb9e1a914e1f5a5aad07e2ce1ce080d4a85fd36786c9f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-runtime \
mvn-org.apache.felix-org.apache.felix.gogo.runtime \
mvn-org.apache.felix-org.apache.felix.gogo.runtime-pom- \
osgi-org.apache.felix.gogo.runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
