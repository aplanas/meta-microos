SUMMARY = "AWS Java SDK for Amazon Inspector Service"
DESCRIPTION = "The AWS Java SDK for Amazon Inspector Service module \
holds the client classes that are used for communicating with \
Amazon Inspector Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-inspector-1.11.3-7.9.noarch.rpm"
RPM_HASH = "847f5f5b06e98d91fa0ec465848a364788ed8d23634648673879bfd9b0ebcf979ace29afb68063ff4ff225de1864fb915918ca37de8aed671298f4a45d39b57f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-inspector \
mvn-com.amazonaws-aws-java-sdk-inspector \
mvn-com.amazonaws-aws-java-sdk-inspector-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
