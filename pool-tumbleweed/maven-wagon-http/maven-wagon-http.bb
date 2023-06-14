SUMMARY = "The http module for maven-wagon"
DESCRIPTION = "The http module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-3.5.3-1.1.noarch.rpm"
RPM_HASH = "f0edd5b186faa1717d39972bc7eea174ea092a0c3ab043280e87255ab30a8d46ab41e801154e7882ca5708f8c4126d9b536368d9b73b9d1ae9d943650becefbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-http \
mvn-org.apache.maven.wagon-wagon-http \
mvn-org.apache.maven.wagon-wagon-http--shaded- \
mvn-org.apache.maven.wagon-wagon-http-pom- \
mvn-org.apache.maven.wagon-wagon-http-pom-shaded-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven.wagon-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-slf4j-simple"

inherit rpm
