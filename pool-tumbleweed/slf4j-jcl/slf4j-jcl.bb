SUMMARY = "SLF4J JCL Binding"
DESCRIPTION = "SLF4J JCL Binding."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-jcl-1.7.36-4.2.noarch.rpm"
RPM_HASH = "616467d42b0d2588a34b81ab7cc7df87d24feb80d36d61b4a8b95561d6ea90087f720edd338de0224d91fdeed60458449126243ae8c8e35c2175d4308707d3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-jcl \
mvn-org.slf4j-slf4j-jcl-pom- \
osgi-slf4j.jcl \
slf4j-jcl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-org.slf4j-slf4j-api \
osgi-slf4j.api"

inherit rpm
