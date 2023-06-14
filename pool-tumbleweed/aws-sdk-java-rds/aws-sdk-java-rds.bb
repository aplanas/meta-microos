SUMMARY = "AWS Java SDK for Amazon RDS"
DESCRIPTION = "The AWS Java SDK for Amazon RDS module holds the \
client classes that are used for communicating with \
Amazon Relational Database Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-rds-1.11.3-7.8.noarch.rpm"
RPM_HASH = "e61c0f0c9e005b4b3d3b5d824a90accab7db8ded71474d2aae8ebaa33a0cd24e39ac0271d27f545302237970a014df0e1066a78f39e72f124ee93ec67ddfcc12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-rds \
mvn-com.amazonaws-aws-java-sdk-rds \
mvn-com.amazonaws-aws-java-sdk-rds-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
