SUMMARY = "AWS SDK for Java - BOM"
DESCRIPTION = "The AWS SDK for Java - BOM module holds the \
dependency managements for individual Java clients."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-bom-1.11.3-7.9.noarch.rpm"
RPM_HASH = "6d57ab16a47907d1c6b27f49ae6441bb002e2cc1b6ee8c0725e2e626dba32b1da0473893e177bb7266cca6753a6d297d6736f4d330f2afdc6ad0afe9a5280245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-bom \
mvn-com.amazonaws-aws-java-sdk-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-pom-pom-"

inherit rpm
