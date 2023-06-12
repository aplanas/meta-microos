SUMMARY = "Jakarta Commons Digester Package"
DESCRIPTION = "The goal of the Jakarta Commons Digester project is to create and \
maintain an XML to Java object mapping package written in the Java \
language to be distributed under the ASF license."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "apache-commons-digester-2.1-4.6.noarch.rpm"
RPM_HASH = "92c47b69099e700daf6c9767fb251bd2413942b8aa9168760374df1f25033f5a13fc3c3493c57a2d3ea60a37e5f0a01e04c180f2db1f89e34a15c6289135e54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester \
commons-digester \
jakarta-commons-digester \
mvn(commons-digester:commons-digester) \
mvn(commons-digester:commons-digester:pom:) \
mvn(org.apache.commons:commons-digester) \
mvn(org.apache.commons:commons-digester:pom:) \
osgi(org.apache.commons.commons-digester)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-beanutils:commons-beanutils) \
mvn(commons-logging:commons-logging)"

inherit rpm
