SUMMARY = "AWS Java SDK for Amazon Machine Learning"
DESCRIPTION = "The AWS Java SDK for Amazon Machine Learning module \
holds the client classes that is used for communicating \
with Amazon Machine Learning Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-machinelearning-1.11.3-7.9.noarch.rpm"
RPM_HASH = "8abbeab1f453034d79e40ac63955b8528f8b9b3a811863bb35d54665107b776dfed77dd14f6e5de4051fa5959edef2062026a1bcdf6741f26cfea3df360ab146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-machinelearning \
mvn-com.amazonaws-aws-java-sdk-machinelearning \
mvn-com.amazonaws-aws-java-sdk-machinelearning-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
