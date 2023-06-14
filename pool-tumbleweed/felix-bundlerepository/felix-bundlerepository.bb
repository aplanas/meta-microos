SUMMARY = "Bundle repository service"
DESCRIPTION = "Bundle repository service"
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.10"

RPM_NAME = "felix-bundlerepository-2.0.10-1.6.noarch.rpm"
RPM_HASH = "ae89efee0f2d2039bd78bb2a646b4697381f0c3dcf45ed772091f18349abb852ba98bdc5e2e7e86f57d2b4e9ee47aeef4b86e739ecc73eba4d459be8457979b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-bundlerepository \
mvn-org.apache.felix-org.apache.felix.bundlerepository \
mvn-org.apache.felix-org.apache.felix.bundlerepository-pom- \
osgi-org.apache.felix.bundlerepository"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.sf.kxml-kxml2 \
mvn-org.apache.felix-org.apache.felix.utils \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core \
mvn-xpp3-xpp3"

inherit rpm
