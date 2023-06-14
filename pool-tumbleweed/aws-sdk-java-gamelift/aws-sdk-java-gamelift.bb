SUMMARY = "AWS Java SDK for AWS GameLift"
DESCRIPTION = "The AWS Java SDK for AWS GameLift module holds the \
client classes that are used for communicating with \
AWS GameLift service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-gamelift-1.11.3-7.8.noarch.rpm"
RPM_HASH = "ab1b90c32bc4b9729ad709aa54eaefcd9f0cfce902737e0867c772f4c90c27c24c85a7a46e6b108e106e6131a17ad2d5490d654a1e629fa125a13eda8ed95e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-gamelift \
mvn-com.amazonaws-aws-java-sdk-gamelift \
mvn-com.amazonaws-aws-java-sdk-gamelift-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
