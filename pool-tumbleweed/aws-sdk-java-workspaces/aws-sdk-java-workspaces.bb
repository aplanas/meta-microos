SUMMARY = "AWS Java SDK for Amazon WorkSpaces"
DESCRIPTION = "The AWS Java SDK for Amazon WorkSpaces module holds the \
client classes that are used for communicating with \
Amazon WorkSpaces Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-workspaces-1.11.3-7.9.noarch.rpm"
RPM_HASH = "98838d1886ca8b7624abf7a214d9a419eed9ed7f68f95764f2d5a64c3b992c6e7c0ddede96c026aac4888dccdc5fe0e31964739eb3f963374fdb15f110ee0578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-workspaces \
mvn-com.amazonaws-aws-java-sdk-workspaces \
mvn-com.amazonaws-aws-java-sdk-workspaces-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
