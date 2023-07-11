SUMMARY = "Utility methods for accessing and modifying the properties of JavaBeans"
DESCRIPTION = "The scope of this package is to create a package of Java utility \
methods for accessing and modifying the properties of arbitrary \
JavaBeans.  No dependencies outside of the JDK are required, so the use \
of this package is very lightweight."
LICENSE = "Apache-2.0"

PV = "1.9.4"

RPM_NAME = "apache-commons-beanutils-1.9.4-3.15.noarch.rpm"
RPM_HASH = "1b967676ba084bc96dc030288f8abe936dfeb926f6ab3f552175a37c66ac55beaed8bf96b41e997dba785e4f738f181f0bd5de84f8d5eb519f6d901febecb409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-beanutils \
commons-beanutils \
jakarta-commons-beanutils \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-beanutils-commons-beanutils-bean-collections \
mvn-commons-beanutils-commons-beanutils-bean-collections-pom- \
mvn-commons-beanutils-commons-beanutils-core \
mvn-commons-beanutils-commons-beanutils-core-pom- \
mvn-commons-beanutils-commons-beanutils-pom-"

RDEPENDS:${PN} += "commons-collections \
commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-collections-commons-collections \
mvn-commons-logging-commons-logging"

inherit rpm
