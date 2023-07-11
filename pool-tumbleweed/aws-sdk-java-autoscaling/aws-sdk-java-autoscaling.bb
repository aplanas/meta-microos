SUMMARY = "AWS Java SDK for Auto Scaling"
DESCRIPTION = "The AWS Java SDK for Auto Scaling module holds the \
client classes that are used for communicating with \
Auto Scaling Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-autoscaling-1.11.3-7.9.noarch.rpm"
RPM_HASH = "374784d0c00c02ac90f34c61bb819ceb7a173ef0858e76ed1afc13f8e3a6d37a9734f0032b08a8732e0143bd72bd44d0b43f512e789e4544120474f538e67fb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-autoscaling \
mvn-com.amazonaws-aws-java-sdk-autoscaling \
mvn-com.amazonaws-aws-java-sdk-autoscaling-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
