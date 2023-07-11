SUMMARY = "Java library to reliably execute external processes from within the JVM"
DESCRIPTION = "Commons Exec is a library for dealing with external process execution and \
environment management in Java."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-exec-1.3-2.7.noarch.rpm"
RPM_HASH = "16942e6ffba2fd6fba69f4c34b61a538cafbca322868e326cc3db5d70b00ceade570be917da3e40199c15c2bdc54c7512fd36469d77fb764233933ef8fe31c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-exec \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.commons-commons-exec-pom- \
osgi-org.apache.commons.commons-exec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
