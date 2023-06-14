SUMMARY = "AWS Java SDK for AWS WAF"
DESCRIPTION = "The AWS Java SDK for AWS WAF Service module holds the \
client classes that are used for communicating with \
AWS WAF Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-waf-1.11.3-7.8.noarch.rpm"
RPM_HASH = "c609982db5767432494dbb6fff200028bf8ffcbfc64057702cb4a69f3ad94fcfa5ee3a97d56fccd1f6a7c14648db8ee4eca9a21af2640921427a21494c8d23a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-waf \
mvn-com.amazonaws-aws-java-sdk-waf \
mvn-com.amazonaws-aws-java-sdk-waf-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
