SUMMARY = "AWS Java SDK for AWS Lambda"
DESCRIPTION = "The AWS Java SDK for AWS Lambda module holds the \
client classes that are used for communicating with \
AWS Lambda Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-lambda-1.11.3-7.9.noarch.rpm"
RPM_HASH = "b4b9f406a78f87f8c0fef42846a7f93c89a754c3b98a9f0a3abff6ad46dec53ee7c8cdedf11603c0a537b6afb2b6fefa8cb810d2d5b6b03df70f33cda650a34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-lambda \
mvn-com.amazonaws-aws-java-sdk-lambda \
mvn-com.amazonaws-aws-java-sdk-lambda-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
