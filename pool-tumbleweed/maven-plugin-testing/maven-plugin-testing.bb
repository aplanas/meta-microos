SUMMARY = "Maven Plugin Testing"
DESCRIPTION = "The Maven Plugin Testing contains the necessary modules \
to be able to test Maven Plugins."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-plugin-testing-3.3.0-5.13.noarch.rpm"
RPM_HASH = "e3dcc3de947cc2484b20ecda0617f0598f4b54d9e458e5a790f64ba0ed56a21e9d230f041bf15916a6e47df1126feeda67d659736aaf065f0614bdb13fbe000c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-pom- \
mvn-org.apache.maven.shared-maven-plugin-testing-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-parent-pom-"

inherit rpm
