SUMMARY = "Compatibility Maven monitor artifact"
DESCRIPTION = "Maven monitor artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-monitor-2.2.1-3.9.noarch.rpm"
RPM_HASH = "6a6b609024409cacf5c08e91eaef6ee9bcedfbc6c22ec1e92730a20bb0a11c065a97c7b90e4a577392f2db72f2a32370be965fbfd112737f843ebc4f99bfa3cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-monitor \
mvn-org.apache.maven-maven-monitor \
mvn-org.apache.maven-maven-monitor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
