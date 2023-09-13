SUMMARY = "JBoss Log Manager"
DESCRIPTION = "This package contains the JBoss Log Manager"
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-2.0.4-2.1.noarch.rpm"
RPM_HASH = "29a490b0ec5eb7836340fee6c48c80b63852d24771b06dab78b5f72b086fb114318a4b3c28d0a8fef97a5c44be2eb8060175740e10b96bda71c5487f2c14de3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager \
mvn-org.jboss.logmanager-jboss-logmanager \
mvn-org.jboss.logmanager-jboss-logmanager-pom- \
osgi-org.jboss.logmanager.jboss-logmanager"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
