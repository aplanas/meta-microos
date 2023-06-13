SUMMARY = "AWS Java SDK for Amazon SES"
DESCRIPTION = "The AWS Java SDK for Amazon SES module holds the \
client classes that are used for communicating with \
Amazon Simple Email Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ses-1.11.3-7.8.noarch.rpm"
RPM_HASH = "2a6a23c02a6a275abf5e6d0756339d15db539c169ff3daf6381675eab7d15ceb5f0d89e8f500199fcbf42570c96486b66f94fe4667826fc5689b685259bbaa04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ses \
mvn(com.amazonaws:aws-java-sdk-ses) \
mvn(com.amazonaws:aws-java-sdk-ses:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
