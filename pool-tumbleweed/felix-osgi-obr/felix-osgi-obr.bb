SUMMARY = "Felix OSGi OBR Service API"
DESCRIPTION = "OSGi OBR Service API."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "felix-osgi-obr-1.0.2-1.7.noarch.rpm"
RPM_HASH = "0d308f86460ab7bbf094c6c03963c4220d2af3731cfb76a18c31622ba54da194476b3f5a99bab5bb69b1f04bf4ac97b1896ec2e6e13eaf88d9b74de7452b92f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-osgi-obr \
mvn-org.apache.felix-org.osgi.service.obr \
mvn-org.apache.felix-org.osgi.service.obr-pom- \
osgi-org.osgi.service.obr"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-osgi.core"

inherit rpm
