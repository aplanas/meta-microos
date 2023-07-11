SUMMARY = "AWS SDK for Java - Core"
DESCRIPTION = "The AWS SDK for Java - Core module holds the classes that \
is used by the individual service clients to interact with \
Amazon Web Services. Users need to depend on aws-java-sdk \
artifact for accessing individual client classes."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-core-1.11.3-7.9.noarch.rpm"
RPM_HASH = "a5325383bd0fec421ff988c9bee1bd499a36b426f0939fb84feddfbb3baf1cb432f3de965d9df3094f8d53c4dfb968b62a34e18ce71567ebc153763fac11ef73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-core \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor \
mvn-commons-logging-commons-logging \
mvn-javax.xml.bind-jaxb-api \
mvn-joda-time-joda-time \
mvn-org.apache.httpcomponents-httpclient"

inherit rpm
