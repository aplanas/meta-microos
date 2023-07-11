SUMMARY = "AWS Java SDK for Amazon Cognito Sync"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Sync module holds the \
client classes that are used for communicating with \
Amazon Cognito Sync Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitosync-1.11.3-7.9.noarch.rpm"
RPM_HASH = "8c5bda64d58d23bf236e08919cb30fbbcbc9923e72d485a9fdc3bdc754edacd49f243e745db01f3de3ddb61450043bb77c1cc4f2a427658dbfa2a3f0be142b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitosync \
mvn-com.amazonaws-aws-java-sdk-cognitosync \
mvn-com.amazonaws-aws-java-sdk-cognitosync-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
