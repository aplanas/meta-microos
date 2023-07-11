SUMMARY = "AWS Java SDK for AWS CloudTrail"
DESCRIPTION = "The AWS Java SDK for AWS CloudTrail module holds the \
client classes that are used for communicating with \
AWS CloudTrail Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudtrail-1.11.3-7.9.noarch.rpm"
RPM_HASH = "88365b406d46f1e27399980412043739ec3d902150b2c6259e86358d9e65776b9f5897b4426f92ab1718e46d39aa0da94ce2bba0326301b557715a9d275baa37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudtrail \
mvn-com.amazonaws-aws-java-sdk-cloudtrail \
mvn-com.amazonaws-aws-java-sdk-cloudtrail-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
