SUMMARY = "AWS Java SDK for Amazon SimpleDB"
DESCRIPTION = "The AWS Java SDK for Amazon SimpleDB module holds the \
client classes that are used for communicating with \
Amazon SimpleDB Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-simpledb-1.11.3-7.8.noarch.rpm"
RPM_HASH = "01b076dc8962a3cd44c7a708f06be9d1c150274c8503966f82f95435890380bb4e6f0f7d792a3f4c173d1a5370e3c23efb5f2309d8b8c6f15765d5f1aec9c597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-simpledb \
mvn(com.amazonaws:aws-java-sdk-simpledb) \
mvn(com.amazonaws:aws-java-sdk-simpledb:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
