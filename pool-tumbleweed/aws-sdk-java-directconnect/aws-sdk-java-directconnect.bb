SUMMARY = "AWS Java SDK for AWS Direct Connect"
DESCRIPTION = "The AWS Java SDK for AWS Direct Connect module holds the \
client classes that are used for communicating with \
AWS Direct Connect Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-directconnect-1.11.3-7.9.noarch.rpm"
RPM_HASH = "19e678445d58423ea5a2949cf2978d68392d91b20d10c4d0a46213f1520fe0be09bc57b505f7e0fd12a743cee0a71048ede203269b79898cb0726238ea29f8de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-directconnect \
mvn-com.amazonaws-aws-java-sdk-directconnect \
mvn-com.amazonaws-aws-java-sdk-directconnect-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
