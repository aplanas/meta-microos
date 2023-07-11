SUMMARY = "AWS Java SDK for AWS Application Auto Scaling"
DESCRIPTION = "The AWS Java SDK for AWS Application Auto Scaling module \
holds the client classes that are used for communicating \
with AWS Application Auto Scaling service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-applicationautoscaling-1.11.3-7.9.noarch.rpm"
RPM_HASH = "8c85749f856426ac56a80d6da48e8bf7feccfa03666cc134b03d7a0c8d862bf9bfa20474ca277d545c5f9deade7aa2e5c64e5ac3afcbefe8f6035c1afdf827d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-applicationautoscaling \
mvn-com.amazonaws-aws-java-sdk-applicationautoscaling \
mvn-com.amazonaws-aws-java-sdk-applicationautoscaling-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
