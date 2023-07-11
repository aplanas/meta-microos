SUMMARY = "AWS Java SDK for the Amazon EC2 Container Service"
DESCRIPTION = "The AWS Java SDK for the Amazon EC2 Container Service \
holds the client classes that are used for communicating \
with the Amazon EC2 Container Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ecs-1.11.3-7.9.noarch.rpm"
RPM_HASH = "e80c0defd0dd201910f64a2f5bae3a13dcdfb6f60c4e265922ccb754eccd5ae102c621f6e8b1ea8e82afe5d250c1c36c5fbf216af64b75e162897c2f34c38e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ecs \
mvn-com.amazonaws-aws-java-sdk-ecs \
mvn-com.amazonaws-aws-java-sdk-ecs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
