SUMMARY = "Apache Resource Bundles"
DESCRIPTION = "An archive which contains templates for generating the necessary license files \
and notices for all Apache releases."
LICENSE = "Apache-2.0"

PV = "2"

RPM_NAME = "apache-resource-bundles-2-1.17.noarch.rpm"
RPM_HASH = "e73e9d426576de9c99494726ab0620c0b56953ec9917a51b89e565a7476a2bd24287a4eeedb6b243a2bb35c77772926c9c643363e03e2dcb04c8e1fa47129652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-resource-bundles \
mvn(org.apache:apache-incubator-disclaimer-resource-bundle) \
mvn(org.apache:apache-incubator-disclaimer-resource-bundle:pom:) \
mvn(org.apache:apache-jar-resource-bundle) \
mvn(org.apache:apache-jar-resource-bundle:pom:) \
mvn(org.apache:apache-license-header-resource-bundle) \
mvn(org.apache:apache-license-header-resource-bundle:pom:) \
mvn(org.apache:apache-resource-bundles:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
