SUMMARY = "AWS SDK for Java - Test Utils"
DESCRIPTION = "The AWS SDK for Java - Test Utils module holds the \
all the utilities that are used by the tests."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-test-utils-1.11.3-7.8.noarch.rpm"
RPM_HASH = "fe91e31a4ef0a0ec8a4ae0f6b2c9d2548a6d5bd59f035620a383d0d2d6081d64fcf8d074e106ba04a4cd4167054aa20898e33477f034886104dd80eff5543f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-test-utils \
mvn(com.amazonaws:aws-java-sdk-test-utils) \
mvn(com.amazonaws:aws-java-sdk-test-utils:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core) \
mvn(junit:junit)"

inherit rpm
