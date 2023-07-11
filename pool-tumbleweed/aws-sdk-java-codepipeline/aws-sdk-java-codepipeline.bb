SUMMARY = "AWS Java SDK for AWS CodePipeline"
DESCRIPTION = "The AWS Java SDK for AWS CodePipeline module \
holds the client classes that are used for \
communicating with AWS CodePipeline."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codepipeline-1.11.3-7.9.noarch.rpm"
RPM_HASH = "298a3598ab148876435d43145d7f480b9211492595090c3930faffc456f71a07ee43299d01ca97a54e91ed1d532b065393d0e7375e5b557c6448e0d28ca245f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codepipeline \
mvn-com.amazonaws-aws-java-sdk-codepipeline \
mvn-com.amazonaws-aws-java-sdk-codepipeline-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
