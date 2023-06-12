SUMMARY = "AWS Java SDK for AWS Lambda"
DESCRIPTION = "The AWS Java SDK for AWS Lambda module holds the \
client classes that are used for communicating with \
AWS Lambda Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-lambda-1.11.3-7.8.noarch.rpm"
RPM_HASH = "6c83a12b1b62a618444cc08b7da5aa2ec898f8509113fcd8bd76646f2a97eec454898d4ff7f151e9ff9c985dc19c575b9ff304e1807341398def675945561d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-lambda \
mvn(com.amazonaws:aws-java-sdk-lambda) \
mvn(com.amazonaws:aws-java-sdk-lambda:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
