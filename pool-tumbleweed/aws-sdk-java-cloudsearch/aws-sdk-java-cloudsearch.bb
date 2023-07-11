SUMMARY = "AWS Java SDK for Amazon CloudSearch"
DESCRIPTION = "The AWS Java SDK for Amazon CloudSearch module holds the \
client classes that are used for communicating with \
Amazon CloudSearch Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudsearch-1.11.3-7.9.noarch.rpm"
RPM_HASH = "692df35d74b516107dda254bbc3e0cd20c6ad2eab6042978ad308ecada3540ebe62f197b10078104edcf66fc32abdcf8cc3378e71a80333192ac0a5f35bc36e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudsearch \
mvn-com.amazonaws-aws-java-sdk-cloudsearch \
mvn-com.amazonaws-aws-java-sdk-cloudsearch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
