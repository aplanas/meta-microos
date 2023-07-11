SUMMARY = "AWS Java SDK for AWS Support"
DESCRIPTION = "The AWS Java SDK for AWS Support module holds the \
client classes that are used for communicating with \
AWS Support Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-support-1.11.3-7.9.noarch.rpm"
RPM_HASH = "b3736e6081c7441f5d1a03070ac9e97e325a6c85f731dff70a0d19ff21632e8a8e56df1f52e78735be687334a90d40c416279b19aebc51302163f98949527a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-support \
mvn-com.amazonaws-aws-java-sdk-support \
mvn-com.amazonaws-aws-java-sdk-support-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
