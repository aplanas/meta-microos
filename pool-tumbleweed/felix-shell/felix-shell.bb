SUMMARY = "Apache Felix Shell Service"
DESCRIPTION = "A simple OSGi command shell service."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "felix-shell-1.4.3-4.7.noarch.rpm"
RPM_HASH = "bfbd2f82136666d1812871d49560ab2a2594ec77d7c6f916b1d99e8caf7140f288fbc2716e35ae73439888b71a1a59658a336d044364dfc52f138aab2ea9e2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-shell \
mvn-org.apache.felix-org.apache.felix.shell \
mvn-org.apache.felix-org.apache.felix.shell-pom- \
osgi-org.apache.felix.shell"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core"

inherit rpm
