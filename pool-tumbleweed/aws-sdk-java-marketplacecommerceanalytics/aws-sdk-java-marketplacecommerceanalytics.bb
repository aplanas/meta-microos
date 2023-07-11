SUMMARY = "AWS Java SDK for AWS Marketplace Commerce Analytics"
DESCRIPTION = "The AWS Java SDK for AWS Marketplace Commerce Analytics Service module \
holds the client classes that are used for communicating with \
AWS Marketplace Commerce Analytics Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-marketplacecommerceanalytics-1.11.3-7.9.noarch.rpm"
RPM_HASH = "15e1e5a776b9d8e0183e186fa87cdac3d03a798fbdf75e669603d47ae5f3e900aca9ba0cebabe66ed50f64a28f13891eb1f19d424873cb9e8876d379bbe7f5e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-marketplacecommerceanalytics \
mvn-com.amazonaws-aws-java-sdk-marketplacecommerceanalytics \
mvn-com.amazonaws-aws-java-sdk-marketplacecommerceanalytics-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
