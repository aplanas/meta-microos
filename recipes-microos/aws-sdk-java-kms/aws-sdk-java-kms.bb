SUMMARY = "AWS Java SDK for AWS KMS"
DESCRIPTION = "The AWS Java SDK for AWS KMS module holds the \
client classes that are used for communicating with \
AWS Key Management Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-kms-1.11.3-7.8.noarch.rpm"
RPM_HASH = "470a039178d01d810562d08d6db6a3eebf8e62fbe370d5ad5d25cae97cadb6a9989c0ba61d8957d5894ff7957fd3ce557a1bf7f03dffc836291d0bd6b583e202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-kms mvn(com.amazonaws:aws-java-sdk-kms) mvn(com.amazonaws:aws-java-sdk-kms:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
