SUMMARY = "AWS Java SDK for Amazon SimpleDB"
DESCRIPTION = "The AWS Java SDK for Amazon SimpleDB module holds the \
client classes that are used for communicating with \
Amazon SimpleDB Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-simpledb-1.11.3-7.9.noarch.rpm"
RPM_HASH = "1910aef982a9cf2209f959570fd41aef8c09bf61d418073de2ba220540be5ee7b463d636b568f9fda1c8a6875d5cc37f4d10ebf36a8b04020e1af0a1a268932e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-simpledb \
mvn-com.amazonaws-aws-java-sdk-simpledb \
mvn-com.amazonaws-aws-java-sdk-simpledb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
