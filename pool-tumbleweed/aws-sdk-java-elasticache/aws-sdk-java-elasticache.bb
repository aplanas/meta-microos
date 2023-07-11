SUMMARY = "AWS Java SDK for Amazon ElastiCache"
DESCRIPTION = "The AWS Java SDK for Amazon ElastiCache module holds the \
client classes that are used for communicating with \
Amazon ElastiCache Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticache-1.11.3-7.9.noarch.rpm"
RPM_HASH = "d15a1fcbd5710835f3078ac4a985ed26d49c3fbee14572ef11bdcca16d25e8dcf575af00059980ccf527591c7583d564ee20f884780b407699172810acc82129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticache \
mvn-com.amazonaws-aws-java-sdk-elasticache \
mvn-com.amazonaws-aws-java-sdk-elasticache-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
