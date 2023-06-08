SUMMARY = "AWS Java SDK for the Amazon EC2 Container Service"
DESCRIPTION = "The AWS Java SDK for the Amazon EC2 Container Service \
holds the client classes that are used for communicating \
with the Amazon EC2 Container Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ecs-1.11.3-7.8.noarch.rpm"
RPM_HASH = "fb80745b0cc42a1981e9817effc6f9ab157a2f60ad34eef8896adaa6c85b16952e85c5e859ae8efe740b0c045723b9fc73b74b1fcf090600b36f26f6a6c388f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ecs mvn(com.amazonaws:aws-java-sdk-ecs) mvn(com.amazonaws:aws-java-sdk-ecs:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
