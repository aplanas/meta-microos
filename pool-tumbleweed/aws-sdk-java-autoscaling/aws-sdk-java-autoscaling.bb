SUMMARY = "AWS Java SDK for Auto Scaling"
DESCRIPTION = "The AWS Java SDK for Auto Scaling module holds the \
client classes that are used for communicating with \
Auto Scaling Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-autoscaling-1.11.3-7.8.noarch.rpm"
RPM_HASH = "21578a7d90f58e2a30db97869694c43132b9367ed2d724cbcdf4f9f6a95a95ee4a2d702bd2294418b8a729b8229244006854165c7f2944dd994c9d371e2a7a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-autoscaling \
mvn(com.amazonaws:aws-java-sdk-autoscaling) \
mvn(com.amazonaws:aws-java-sdk-autoscaling:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
