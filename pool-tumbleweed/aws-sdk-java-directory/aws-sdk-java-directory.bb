SUMMARY = "AWS Java SDK for AWS Directory Service"
DESCRIPTION = "The AWS Java SDK for AWS Directory Service module \
holds the client classes that is used for \
communicating with AWS Directory Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-directory-1.11.3-7.9.noarch.rpm"
RPM_HASH = "8eaa098a2b63bd960d6757292560f1ce87aed5586f1ca0e2e8db092f547883b961a1084b6caac744f49508dfe41a310723a9b07bf52f2bca17747e58b4324238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-directory \
mvn-com.amazonaws-aws-java-sdk-directory \
mvn-com.amazonaws-aws-java-sdk-directory-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
