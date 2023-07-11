SUMMARY = "The http-shared module for maven-wagon"
DESCRIPTION = "The http-shared module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-shared-3.5.3-1.2.noarch.rpm"
RPM_HASH = "e0a1078cdac08bb987b8ba17060fe41ec85fc584d33df01454466f1523d019a1818fe7d2053903f89bc26abcdcc70c66aff8bb8cc928d1e644d2f26134f1fba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-http-shared-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.jsoup-jsoup \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple"

inherit rpm
