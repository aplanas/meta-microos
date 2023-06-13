SUMMARY = "Parent pom for Apache Felix Gogo"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers."
LICENSE = "Apache-2.0"

PV = "4"

RPM_NAME = "felix-gogo-parent-4-1.11.noarch.rpm"
RPM_HASH = "149b755bd07470546284fc1a2f0e9a311f1739005b80d2e46f39f7f80a63388e7811a0d2a49ebd7a22911b20ada81fe8c7f2fb30e7d9361df7dc69f3a3ce5be8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-parent \
mvn(org.apache.felix:gogo-parent:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.felix:felix-parent:pom:)"

inherit rpm
