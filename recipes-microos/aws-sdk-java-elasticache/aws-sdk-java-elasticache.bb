SUMMARY = "AWS Java SDK for Amazon ElastiCache"
DESCRIPTION = "The AWS Java SDK for Amazon ElastiCache module holds the \
client classes that are used for communicating with \
Amazon ElastiCache Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticache-1.11.3-7.8.noarch.rpm"
RPM_HASH = "8373acf87acf07f0e2ee652f3f4a07e36771fd457440f07cb96976b9717399901a16d98335e124636a9d8469d293254b881a3f57916aa2216714680fd2d882b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticache mvn(com.amazonaws:aws-java-sdk-elasticache) mvn(com.amazonaws:aws-java-sdk-elasticache:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
