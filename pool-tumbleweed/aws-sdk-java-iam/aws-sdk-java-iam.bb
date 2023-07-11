SUMMARY = "AWS Java SDK for AWS IAM"
DESCRIPTION = "The AWS Java SDK for AWS IAM module holds the \
client classes that are used for communicating with \
AWS Identity and Access Management Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-iam-1.11.3-7.9.noarch.rpm"
RPM_HASH = "db2151359c391e14054a26109fbf9dd15ba72a14df3c8547044ef79fd75194f59803f9aa19d016cfcf8b623c61648643c8eff6b7ac61378d1dad9dea6b89d0f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-iam \
mvn-com.amazonaws-aws-java-sdk-iam \
mvn-com.amazonaws-aws-java-sdk-iam-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
