SUMMARY = "AWS Java SDK for Amazon Machine Learning"
DESCRIPTION = "The AWS Java SDK for Amazon Machine Learning module \
holds the client classes that is used for communicating \
with Amazon Machine Learning Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-machinelearning-1.11.3-7.8.noarch.rpm"
RPM_HASH = "b4a8973705aff714e45646aa9f102c95473d44d56bd3eeae0b72029cbeb3d3d466ff8d2605edf25cc5abb91d691c1a4dd832ac14b0a782245440ea035b959a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-machinelearning mvn(com.amazonaws:aws-java-sdk-machinelearning) mvn(com.amazonaws:aws-java-sdk-machinelearning:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
