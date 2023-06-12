SUMMARY = "Compatibility Maven model artifact"
DESCRIPTION = "Maven model artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-model-2.2.1-3.8.noarch.rpm"
RPM_HASH = "05ca62c6538916fef0631ef775c586b0185770948c56e3d9fd41fe939b8458829a132e67ea2747cca6a0b2c81b9ec32b4fb89019884ae431b50808ce1322245a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-model \
mvn(org.apache.maven:maven-model:2.0.2) \
mvn(org.apache.maven:maven-model:2.0.6) \
mvn(org.apache.maven:maven-model:2.0.7) \
mvn(org.apache.maven:maven-model:2.0.8) \
mvn(org.apache.maven:maven-model:2.2.1) \
mvn(org.apache.maven:maven-model:pom:2.0.2) \
mvn(org.apache.maven:maven-model:pom:2.0.6) \
mvn(org.apache.maven:maven-model:pom:2.0.7) \
mvn(org.apache.maven:maven-model:pom:2.0.8) \
mvn(org.apache.maven:maven-model:pom:2.2.1)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
