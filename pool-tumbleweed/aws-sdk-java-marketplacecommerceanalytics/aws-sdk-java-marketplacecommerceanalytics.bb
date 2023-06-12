SUMMARY = "AWS Java SDK for AWS Marketplace Commerce Analytics"
DESCRIPTION = "The AWS Java SDK for AWS Marketplace Commerce Analytics Service module \
holds the client classes that are used for communicating with \
AWS Marketplace Commerce Analytics Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-marketplacecommerceanalytics-1.11.3-7.8.noarch.rpm"
RPM_HASH = "fb4534ad3be23fd53395f3d12c35e11be30fbe635a233db5c39b8ef6bcab9afaffa0b361a73f93f1e78fa0511117ae4ade1d6d50cdac108a3aa6c2d3c490464d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-marketplacecommerceanalytics \
mvn(com.amazonaws:aws-java-sdk-marketplacecommerceanalytics) \
mvn(com.amazonaws:aws-java-sdk-marketplacecommerceanalytics:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
