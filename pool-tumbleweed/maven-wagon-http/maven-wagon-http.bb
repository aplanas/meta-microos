SUMMARY = "The http module for maven-wagon"
DESCRIPTION = "The http module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-3.5.3-1.2.noarch.rpm"
RPM_HASH = "34da7b3c72ecf933461ed683fd752ac4cc8d336c3a82639ba41354069d40e2ab790faef2b1123b95abe231f7191903af9cab244da7423f0c8e5ccd8e8d31b80f"
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
