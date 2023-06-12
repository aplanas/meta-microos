SUMMARY = "Apache Maven Mapping"
DESCRIPTION = "Maven shared component that implements file name mapping."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-mapping-3.0.0-3.10.noarch.rpm"
RPM_HASH = "527e03b445c2872d736d2a78c7ac7f1a57680a154ee7b6965c5ab23493fbbcfca7ad17cc8f70da1aa0e207cd3a341746e2aeb7dce7caf8eaf43b0abdcf2bca8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-mapping \
mvn(org.apache.maven.shared:maven-mapping) \
mvn(org.apache.maven.shared:maven-mapping:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-core) \
mvn(org.codehaus.plexus:plexus-interpolation)"

inherit rpm
