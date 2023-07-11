SUMMARY = "AWS Java SDK for AWS CodeCommit"
DESCRIPTION = "The AWS Java SDK for AWS CodeCommit module \
holds the client classes that are used for \
communicating with AWS CodeCommit."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codecommit-1.11.3-7.9.noarch.rpm"
RPM_HASH = "71e0e52086e4ad631fbd6e9463c657cd95db85d74ec87c836e1d13a0fdb00192cf8fa314abeab1803d1e5717994cf3125b45539aec11dc60fdab4446276bec85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codecommit \
mvn-com.amazonaws-aws-java-sdk-codecommit \
mvn-com.amazonaws-aws-java-sdk-codecommit-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
