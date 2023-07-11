SUMMARY = "AWS Java SDK for AWS Data Pipeline"
DESCRIPTION = "The AWS Java SDK for AWS Data Pipeline module holds the \
client classes that are used for communicating with \
AWS Data Pipeline Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-datapipeline-1.11.3-7.9.noarch.rpm"
RPM_HASH = "85e8f9c0a6f3c9fb1ea116fd3a75782707b1bc35a062a74a94217151e835a579174dc59a034a050212c60ccb20e1e2baf38670da0e3c0c3501b675053a805591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-datapipeline \
mvn-com.amazonaws-aws-java-sdk-datapipeline \
mvn-com.amazonaws-aws-java-sdk-datapipeline-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
