SUMMARY = "AWS Java SDK for Amazon Elasticsearch Service"
DESCRIPTION = "The AWS Java SDK for Amazon Elasticsearch Service module \
holds the client classes that are used for communicating \
with Amazon Elasticsearch Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticsearch-1.11.3-7.8.noarch.rpm"
RPM_HASH = "af84bdd656b0bbfb415e8d7a377097cc2735d2d84b59abe4d4ac40b2e2499df61837ede75d927dd89d72468b5bc1947c6db780d343d82c4bb4c5193a1517511f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticsearch \
mvn(com.amazonaws:aws-java-sdk-elasticsearch) \
mvn(com.amazonaws:aws-java-sdk-elasticsearch:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
