SUMMARY = "AWS Java SDK for Amazon Route53"
DESCRIPTION = "The AWS Java SDK for Amazon Route53 module holds the \
client classes that are used for communicating with \
Amazon Route53 Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-route53-1.11.3-7.9.noarch.rpm"
RPM_HASH = "00fb2d6c098b61aef3dfae110bc2f4ea691cff7e6190a9b2b7189309205675cefa417b8fbbf9a1ff6863678b682f91fa6460cd6c6ba11183a3666111905332a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-route53 \
mvn-com.amazonaws-aws-java-sdk-route53 \
mvn-com.amazonaws-aws-java-sdk-route53-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
