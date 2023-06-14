SUMMARY = "AWS Java SDK for AWS Directory Service"
DESCRIPTION = "The AWS Java SDK for AWS Directory Service module \
holds the client classes that is used for \
communicating with AWS Directory Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-directory-1.11.3-7.8.noarch.rpm"
RPM_HASH = "a82e18185048ca131a1d4e44417a83e15f93b9a0321a9759a9f812e3086a82e7468088980cf88972c3c06278d4af37d8ba04f4e9d8b421274e9e45891dc78ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-directory \
mvn-com.amazonaws-aws-java-sdk-directory \
mvn-com.amazonaws-aws-java-sdk-directory-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
