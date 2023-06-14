SUMMARY = "AWS SDK for Java - Core"
DESCRIPTION = "The AWS SDK for Java - Core module holds the classes that \
is used by the individual service clients to interact with \
Amazon Web Services. Users need to depend on aws-java-sdk \
artifact for accessing individual client classes."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-core-1.11.3-7.8.noarch.rpm"
RPM_HASH = "c85dca5d4905f201c3ff1b00b61e09520c24ac03485da25e8a5e35804b0003b7a44aaa44e1a9a1cb56f4c2bb64deaa5fcc42aa88e180e6e443c58dce22f577aa"
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
