SUMMARY = "TCK for testing atinject compatibility with JSR-330"
DESCRIPTION = "TCK for testing atinject compatibility with JSR-330."
LICENSE = "Apache-2.0"

PV = "1+20160610git1f74ea7"

RPM_NAME = "atinject-tck-1+20160610git1f74ea7-2.6.noarch.rpm"
RPM_HASH = "8fc420fd1cb35291d8054e7ebe0478fd27cafca11a6313566597dce3e26514e5a89aa83bb78c93f7345314c87304e90635593331e01c21c0f0b4875af850f024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atinject-tck \
mvn(javax.inject:javax.inject-tck) \
mvn(javax.inject:javax.inject-tck:pom:) \
osgi(com.google.code.atinject.tck)"
RDEPENDS:${PN} += "atinject \
java-headless \
javapackages-filesystem \
junit \
mvn(javax.inject:javax.inject) \
mvn(junit:junit) \
osgi(org.junit)"

inherit rpm
