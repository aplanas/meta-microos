SUMMARY = "The http-shared module for maven-wagon"
DESCRIPTION = "The http-shared module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-shared-3.5.3-1.1.noarch.rpm"
RPM_HASH = "6221ff010b2fdc609df57016306a9f691dc8b0a84f4877bbea5c8fcd0266b297b10cc7e99f2d3a4a8418c22eda73602756c6b82fae3f8765cbb099f0a1d48868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-http-shared \
mvn(org.apache.maven.wagon:wagon-http-shared) \
mvn(org.apache.maven.wagon:wagon-http-shared:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(org.apache.httpcomponents:httpclient) \
mvn(org.apache.httpcomponents:httpcore) \
mvn(org.apache.maven.wagon:wagon-provider-api) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.jsoup:jsoup) \
mvn(org.slf4j:slf4j-api) \
mvn(org.slf4j:slf4j-simple)"

inherit rpm
