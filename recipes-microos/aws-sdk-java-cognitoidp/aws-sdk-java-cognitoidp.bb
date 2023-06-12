SUMMARY = "AWS Java SDK for Amazon Cognito Identity Provider Service"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Identity Provider Service module \
holds the client classes that are used for communicating with \
Amazon Cognito Identity Provider Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitoidp-1.11.3-7.8.noarch.rpm"
RPM_HASH = "5687fb076aa1d57719e6057a3ba13e4fa3330f3da2abbabfb29722c0dbec667ae8f607a11cc21dc0b6ebe833d4035a458175e2981abac7521425a6011c1e18e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitoidp \
mvn(com.amazonaws:aws-java-sdk-cognitoidp) \
mvn(com.amazonaws:aws-java-sdk-cognitoidp:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
