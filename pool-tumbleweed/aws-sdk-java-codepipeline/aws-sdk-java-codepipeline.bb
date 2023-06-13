SUMMARY = "AWS Java SDK for AWS CodePipeline"
DESCRIPTION = "The AWS Java SDK for AWS CodePipeline module \
holds the client classes that are used for \
communicating with AWS CodePipeline."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codepipeline-1.11.3-7.8.noarch.rpm"
RPM_HASH = "d055939525ed658b090a6dc68b5d905c9cd151835949569614fdc9d97b9528aebecd4cdebd7b79f7eb780ba2da0e2a0667376cab07469eac095fb2aaef04ba25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codepipeline \
mvn(com.amazonaws:aws-java-sdk-codepipeline) \
mvn(com.amazonaws:aws-java-sdk-codepipeline:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
