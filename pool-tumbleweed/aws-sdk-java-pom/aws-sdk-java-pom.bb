SUMMARY = "AWS SDK for Java - Parent POM"
DESCRIPTION = "AWS SDK for Java - Parent POM."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-pom-1.11.3-7.9.noarch.rpm"
RPM_HASH = "b16fd2a5f814222bb9a764dfd4cad8a9e2b8572b64da32f8acf568d9a9a0d43d28500231813d306151f703c333abce85934a74b6d4ccdc04e8bb78d474b5c1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-pom \
mvn-com.amazonaws-aws-java-sdk-pom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
