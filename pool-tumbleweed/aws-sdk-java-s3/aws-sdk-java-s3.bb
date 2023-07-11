SUMMARY = "AWS Java SDK for Amazon S3"
DESCRIPTION = "The AWS Java SDK for Amazon S3 module holds the \
client classes that are used for communicating with \
Amazon Simple Storage Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-s3-1.11.3-7.9.noarch.rpm"
RPM_HASH = "46bd7ff647bcdb5a939662f27645ad347861ae23a2ef1da4d15ccb0d9fb47b3b0b2e89502f8acc04fb8c3813421f5ced5a2e76c212a7db20a537878bf51339c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-s3 \
mvn-com.amazonaws-aws-java-sdk-s3 \
mvn-com.amazonaws-aws-java-sdk-s3-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-kms"

inherit rpm
