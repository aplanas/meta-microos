SUMMARY = "JBoss Log Manager"
DESCRIPTION = "This package contains the JBoss Log Manager"
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-2.0.4-1.21.noarch.rpm"
RPM_HASH = "dfa63bbf4e03a802dd466f46f800d499fe6189d37d3a0c7cb0d2bd053f7a56e902d34ef3e125a140606bd2b8c82ea2f266fe2de06c647bf17497063e4cf856c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager \
mvn-org.jboss.logmanager-jboss-logmanager \
mvn-org.jboss.logmanager-jboss-logmanager-pom- \
osgi-org.jboss.logmanager.jboss-logmanager"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
