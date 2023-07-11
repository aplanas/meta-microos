SUMMARY = "AWS Java SDK for Amazon SES"
DESCRIPTION = "The AWS Java SDK for Amazon SES module holds the \
client classes that are used for communicating with \
Amazon Simple Email Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ses-1.11.3-7.9.noarch.rpm"
RPM_HASH = "7efff9081f932ab1ee2e93783de290d1abb2cf713d7a6950f3e0aabea1352a9c5d64bee68cdfc684664e60c40127463d47adfde293b6f93a1f19b30a98a6049f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ses \
mvn-com.amazonaws-aws-java-sdk-ses \
mvn-com.amazonaws-aws-java-sdk-ses-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
