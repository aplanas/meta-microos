SUMMARY = "AWS Java SDK for Elastic Load Balancing"
DESCRIPTION = "The AWS Java SDK for Elastic Load Balancing module holds the \
client classes that are used for communicating with \
Elastic Load Balancing Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticloadbalancing-1.11.3-7.9.noarch.rpm"
RPM_HASH = "349dda0512fbbbd33769ffa3cb4df590b1bfc7dc5f5c8773ed8d7f9dcf06f3036960fc1c5441ef18e3d2241711b285c94e6725c7d11960283292e0c1570c3301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticloadbalancing \
mvn-com.amazonaws-aws-java-sdk-elasticloadbalancing \
mvn-com.amazonaws-aws-java-sdk-elasticloadbalancing-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
