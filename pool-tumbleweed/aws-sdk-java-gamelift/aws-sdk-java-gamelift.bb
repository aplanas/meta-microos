SUMMARY = "AWS Java SDK for AWS GameLift"
DESCRIPTION = "The AWS Java SDK for AWS GameLift module holds the \
client classes that are used for communicating with \
AWS GameLift service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-gamelift-1.11.3-7.9.noarch.rpm"
RPM_HASH = "1d04a061bcedddf7bd09b49950abf87652aa4b5a4df11d112bde765332ce856836fb145d17af71fe0280660aad97213c44c4a4c967ff7312022402f9714363f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-gamelift \
mvn-com.amazonaws-aws-java-sdk-gamelift \
mvn-com.amazonaws-aws-java-sdk-gamelift-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
