SUMMARY = "AWS Java SDK for AWS Database Migration Service"
DESCRIPTION = "The AWS Java SDK for AWS Database Migration Service module \
holds the client classes that are used for communicating \
with AWS Database Migration Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-dms-1.11.3-7.9.noarch.rpm"
RPM_HASH = "6ac174c917ea0565fb8947ad94cd0abb03dbae8ca60c630c6301942fc71e0edcec7faefd306d515147cb077ba439c426a19b2b66ad80b1868603df67375e279a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-dms \
mvn-com.amazonaws-aws-java-sdk-dms \
mvn-com.amazonaws-aws-java-sdk-dms-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
