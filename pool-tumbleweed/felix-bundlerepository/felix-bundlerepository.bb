SUMMARY = "Bundle repository service"
DESCRIPTION = "Bundle repository service"
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.10"

RPM_NAME = "felix-bundlerepository-2.0.10-1.7.noarch.rpm"
RPM_HASH = "ac6df9448c12de0d50811348f1519573e62ac2af261ad41138b1caaa95b7d35a82ab259f8dbfa292e5a253def9a56e8c8ca06c1a8cfcb1dc4c582d063e8b57d6"
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
