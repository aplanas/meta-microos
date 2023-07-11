SUMMARY = "Jenkins JSON library"
DESCRIPTION = "JSON-lib is a java library for transforming beans, maps, collections, java \
arrays and XML to JSON and back again to beans and DynaBeans. \
 \
This package contains JSON library used in Jenkins."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "jenkins-json-lib-2.4-6.11.noarch.rpm"
RPM_HASH = "324d76fd49e57eb34b3872662b2edfb4d8424fbc69abeb0f3640bad664921cffadf71c3efbc751f43061b6f0dc41102b596186cfd104684fc3a3a298560e3441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jenkins-json-lib \
mvn-org.kohsuke.stapler-json-lib \
mvn-org.kohsuke.stapler-json-lib-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-collections-commons-collections \
mvn-commons-lang-commons-lang \
mvn-commons-logging-commons-logging \
mvn-net.sf.ezmorph-ezmorph"

inherit rpm
