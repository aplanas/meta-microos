SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "felix-gogo-runtime-1.1.0-4.2.noarch.rpm"
RPM_HASH = "332bcd1f4a9750a166c279ab2782ba560956f80f96ce89843166bdac9783deb59678c54730334e0064d0b8425f60fe95470a6518b924387e0c6e553afcaaee54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-runtime \
mvn(org.apache.felix:org.apache.felix.gogo.runtime) \
mvn(org.apache.felix:org.apache.felix.gogo.runtime:pom:) \
osgi(org.apache.felix.gogo.runtime)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
