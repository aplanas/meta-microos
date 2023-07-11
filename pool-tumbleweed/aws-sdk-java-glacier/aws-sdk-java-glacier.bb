SUMMARY = "AWS Java SDK for Amazon Glacier"
DESCRIPTION = "The AWS Java SDK for Amazon Glacier module holds the \
client classes that are used for communicating with \
Amazon Glacier Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-glacier-1.11.3-7.9.noarch.rpm"
RPM_HASH = "525877e0fe43173aba6cf47a9bb5e01845349dca693e7a10284db506c1227dce608a1d11ea140064e8ab15d4bb1ab2bd71828a57ea09e7a5500173b15bf0a25e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-glacier \
mvn-com.amazonaws-aws-java-sdk-glacier \
mvn-com.amazonaws-aws-java-sdk-glacier-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-s3 \
mvn-com.amazonaws-aws-java-sdk-sns \
mvn-com.amazonaws-aws-java-sdk-sqs"

inherit rpm
