SUMMARY = "AWS Java SDK for AWS Elastic Beanstalk"
DESCRIPTION = "The AWS Java SDK for AWS Elastic Beanstalk module holds the \
client classes that are used for communicating with \
AWS Elastic Beanstalk Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticbeanstalk-1.11.3-7.8.noarch.rpm"
RPM_HASH = "5ed7cb6809b74b53e6bda5173344367f4e3f1cd4de3c8b7454b54dcb5d951ae7f054677a8ee7f12d98de09fba1579e23b1d20f0e851cfafacc95b192a1a0a1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticbeanstalk \
mvn(com.amazonaws:aws-java-sdk-elasticbeanstalk) \
mvn(com.amazonaws:aws-java-sdk-elasticbeanstalk:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
