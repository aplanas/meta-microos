SUMMARY = "AWS Java SDK for AWS CloudFormation"
DESCRIPTION = "The AWS Java SDK for AWS CloudFormation module holds the \
client classes that are used for communicating with \
AWS CloudFormation Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudformation-1.11.3-7.9.noarch.rpm"
RPM_HASH = "365e389cdf144b75c84eca9fb6027c9d1c74c252f5e44241cb7eda21fd1267de3c32cc96a9f0b519c47f7382e6b550e0f0d1a6820fba9974e6e80c6819981282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudformation \
mvn-com.amazonaws-aws-java-sdk-cloudformation \
mvn-com.amazonaws-aws-java-sdk-cloudformation-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
