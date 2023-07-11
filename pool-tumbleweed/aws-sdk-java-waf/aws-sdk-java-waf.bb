SUMMARY = "AWS Java SDK for AWS WAF"
DESCRIPTION = "The AWS Java SDK for AWS WAF Service module holds the \
client classes that are used for communicating with \
AWS WAF Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-waf-1.11.3-7.9.noarch.rpm"
RPM_HASH = "f8939b8625f64466d721299db6e88d4cbccff8c04b8bb6d7c646f532208ad3edb3ad64ff1999f0ae7583c92e837be11a72d6daa7ba648d253de0c0476d0ba5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-waf \
mvn-com.amazonaws-aws-java-sdk-waf \
mvn-com.amazonaws-aws-java-sdk-waf-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
