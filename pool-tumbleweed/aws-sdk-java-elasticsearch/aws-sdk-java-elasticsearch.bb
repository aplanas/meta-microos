SUMMARY = "AWS Java SDK for Amazon Elasticsearch Service"
DESCRIPTION = "The AWS Java SDK for Amazon Elasticsearch Service module \
holds the client classes that are used for communicating \
with Amazon Elasticsearch Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticsearch-1.11.3-7.9.noarch.rpm"
RPM_HASH = "ea485053e69fd40d56d2a665308ca48a344925a0263511b33dcd98422947223710732bb61b77b5267433c52d14a76f3839cace2c6064a7cc70fa8d2ae5d54d6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticsearch \
mvn-com.amazonaws-aws-java-sdk-elasticsearch \
mvn-com.amazonaws-aws-java-sdk-elasticsearch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
