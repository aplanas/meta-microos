SUMMARY = "AWS SDK for Java - Test Utils"
DESCRIPTION = "The AWS SDK for Java - Test Utils module holds the \
all the utilities that are used by the tests."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-test-utils-1.11.3-7.9.noarch.rpm"
RPM_HASH = "baf53cd7f2a29c157a42a4788d58e94a07d7ef0b5e196011441fcb9015dcc04075bed59667839b909391c6006c0d78917ee3e22406b44a3eed6f671c204d636d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-test-utils \
mvn-com.amazonaws-aws-java-sdk-test-utils \
mvn-com.amazonaws-aws-java-sdk-test-utils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-junit-junit"

inherit rpm
