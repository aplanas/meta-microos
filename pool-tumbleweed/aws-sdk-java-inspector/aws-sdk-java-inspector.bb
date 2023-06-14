SUMMARY = "AWS Java SDK for Amazon Inspector Service"
DESCRIPTION = "The AWS Java SDK for Amazon Inspector Service module \
holds the client classes that are used for communicating with \
Amazon Inspector Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-inspector-1.11.3-7.8.noarch.rpm"
RPM_HASH = "ec4709df7404f45d8dafa3ae5639a2958f7ee3f13d1099093f95c947809a4161635ab6dd6d908ffd4344c0980d620c7a600635ba6e65a571935a46ef18758315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-inspector \
mvn-com.amazonaws-aws-java-sdk-inspector \
mvn-com.amazonaws-aws-java-sdk-inspector-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
