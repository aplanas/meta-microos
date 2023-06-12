SUMMARY = "AWS Java SDK for AWS STS"
DESCRIPTION = "The AWS Java SDK for AWS STS module holds the \
client classes that are used for communicating with \
AWS Security Token Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sts-1.11.3-7.8.noarch.rpm"
RPM_HASH = "747a1cf85cb3c682b7026219cb27cafae4fca3fe06924b59f9f6b43217ce3e49fdfa4dcdd6fb73b75c69cb10c95e261490592aeccb9d0f4c44cacfa08c4f36b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sts \
mvn(com.amazonaws:aws-java-sdk-sts) \
mvn(com.amazonaws:aws-java-sdk-sts:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
