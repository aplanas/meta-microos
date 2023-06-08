SUMMARY = "AWS Java SDK for AWS Storage Gateway"
DESCRIPTION = "The AWS Java SDK for AWS Storage Gateway module holds the \
client classes that are used for communicating with \
AWS Storage Gateway Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-storagegateway-1.11.3-7.8.noarch.rpm"
RPM_HASH = "05211178c39dcf0f9ca557a859234c67247ad944e8236c6065a62aaa4019b30b5708dca9eefa4fd9cda9fdc8af4493c10dc67f5c75ef8344833c394beab4144b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-storagegateway mvn(com.amazonaws:aws-java-sdk-storagegateway) mvn(com.amazonaws:aws-java-sdk-storagegateway:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
