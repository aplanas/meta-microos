SUMMARY = "Utility methods for accessing and modifying the properties of JavaBeans"
DESCRIPTION = "The scope of this package is to create a package of Java utility \
methods for accessing and modifying the properties of arbitrary \
JavaBeans.  No dependencies outside of the JDK are required, so the use \
of this package is very lightweight."
LICENSE = "Apache-2.0"

PV = "1.9.4"

RPM_NAME = "apache-commons-beanutils-1.9.4-3.14.noarch.rpm"
RPM_HASH = "4f22ee5e0189f817762e6a6da932db66c13665abe4dcb8ada82993652eafe56f8d514316a7edd9f526ebf0db656ba2ad6ee5f138b31865ef9183077ade60a2ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-beanutils \
commons-beanutils \
jakarta-commons-beanutils \
mvn(commons-beanutils:commons-beanutils) \
mvn(commons-beanutils:commons-beanutils-bean-collections) \
mvn(commons-beanutils:commons-beanutils-bean-collections:pom:) \
mvn(commons-beanutils:commons-beanutils-core) \
mvn(commons-beanutils:commons-beanutils-core:pom:) \
mvn(commons-beanutils:commons-beanutils:pom:)"
RDEPENDS:${PN} += "commons-collections \
commons-logging \
java-headless \
javapackages-filesystem \
mvn(commons-collections:commons-collections) \
mvn(commons-logging:commons-logging)"

inherit rpm
