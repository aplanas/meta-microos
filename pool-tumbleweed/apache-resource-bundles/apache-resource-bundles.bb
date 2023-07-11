SUMMARY = "Apache Resource Bundles"
DESCRIPTION = "An archive which contains templates for generating the necessary license files \
and notices for all Apache releases."
LICENSE = "Apache-2.0"

PV = "2"

RPM_NAME = "apache-resource-bundles-2-1.18.noarch.rpm"
RPM_HASH = "d9a1724b998d3a7234b7574698e78ce8553c50b3ea9c61836d6c1a6c14fa7ca5b5e7137bab48e92ccf6b3baec74ac8208ab8a4575703ed9d1018dfaaf2119643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-resource-bundles \
mvn-org.apache-apache-incubator-disclaimer-resource-bundle \
mvn-org.apache-apache-incubator-disclaimer-resource-bundle-pom- \
mvn-org.apache-apache-jar-resource-bundle \
mvn-org.apache-apache-jar-resource-bundle-pom- \
mvn-org.apache-apache-license-header-resource-bundle \
mvn-org.apache-apache-license-header-resource-bundle-pom- \
mvn-org.apache-apache-resource-bundles-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
