SUMMARY = "AWS Java SDK for AWS Elastic Beanstalk"
DESCRIPTION = "The AWS Java SDK for AWS Elastic Beanstalk module holds the \
client classes that are used for communicating with \
AWS Elastic Beanstalk Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticbeanstalk-1.11.3-7.9.noarch.rpm"
RPM_HASH = "5442e66fe4c0333e5364f255822992ccffa554eb9b4ada252e505c972ac36ef96f517123dbddd961ac9d1e70ac657cb5b59eadfd892dd83ecc2deebeda5d7eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticbeanstalk \
mvn-com.amazonaws-aws-java-sdk-elasticbeanstalk \
mvn-com.amazonaws-aws-java-sdk-elasticbeanstalk-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
