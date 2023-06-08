SUMMARY = "AWS Java SDK for Amazon Glacier"
DESCRIPTION = "The AWS Java SDK for Amazon Glacier module holds the \
client classes that are used for communicating with \
Amazon Glacier Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-glacier-1.11.3-7.8.noarch.rpm"
RPM_HASH = "b67ea7a57f8cf2555038d6d3212ffa93adaf648a837d1aa4d130548975dfc96b7cf9aa5609d19dd06b3a5c3dd45a12b2d41d03e03f1ba21cd8382ad209f13712"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-glacier mvn(com.amazonaws:aws-java-sdk-glacier) mvn(com.amazonaws:aws-java-sdk-glacier:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core) mvn(com.amazonaws:aws-java-sdk-s3) mvn(com.amazonaws:aws-java-sdk-sns) mvn(com.amazonaws:aws-java-sdk-sqs)"

inherit rpm
