SUMMARY = "AWS Java SDK for Amazon SWF"
DESCRIPTION = "The AWS Java SDK for Amazon SWF module holds the \
client classes that are used for communicating with \
Amazon Simple Workflow Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-simpleworkflow-1.11.3-7.9.noarch.rpm"
RPM_HASH = "4a0f4b76d8e9e736d6f410a90806b877a4a8a33ecd8aef6151a90f116868d31b8a011d3aa55d177c4f11c19c24a10a65c5cb6df89ef3ed2ccc3a994dd7380161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-simpleworkflow \
mvn-com.amazonaws-aws-java-sdk-simpleworkflow \
mvn-com.amazonaws-aws-java-sdk-simpleworkflow-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
